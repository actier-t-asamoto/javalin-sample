package jp.co.actier.lt.javalin.infrastructure;

import jp.co.actier.lt.javalin.domain.profile.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ProfileInMemoryDataSource implements ProfileRepository {
    private static final ProfileRepository repository = new ProfileInMemoryDataSource();
    public static ProfileRepository initialize() {
        return repository;
    }

    private Map<ProfileId, Profile> profiles;

    private ProfileInMemoryDataSource() {
        this.profiles = new HashMap<>();
        ProfileId initialId = new ProfileId(1L);
        Name name = new Name("asamoto");
        Age age = new Age(30L);
        GenderType genderType = new GenderType(Gender.MALE);
        this.profiles.put(initialId, new Profile(initialId, age, genderType, name));
    }

    @Override
    public Profile save(Profile profile) {
        if (!profile.getProfileId().numbered()) {
            ProfileId numbering = this.numbering();
            Profile newProfile = new Profile(numbering, profile.getAge(), profile.getGenderType(), profile.getName());
            profiles.put(numbering, newProfile);
            return newProfile;
        } else {
            profiles.put(profile.getProfileId(), profile);
            return profile;
        }
    }

    @Override
    public Profile find(ProfileId id) {
        return profiles.get(id);
    }

    @Override
    public Profiles getAll() {
        Profiles all = new Profiles(new ArrayList<>(profiles.values()));
        return all;
    }

    @Override
    public ProfileId delete(ProfileId id) {
        return this.profiles.remove(id).getProfileId();
    }

    private ProfileId numbering() {
        return profiles.keySet().stream()
                .max(Comparator.comparingLong(ProfileId::getValue))
                .orElse(new ProfileId(0L))
        .nextId();
    }
}
