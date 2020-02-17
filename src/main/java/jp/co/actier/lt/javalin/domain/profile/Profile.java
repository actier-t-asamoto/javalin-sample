package jp.co.actier.lt.javalin.domain.profile;

import java.util.Objects;

public class Profile {
    private ProfileId profileId = new ProfileId();
    private Age age = new Age();
    private GenderType genderType = new GenderType();
    private Name name = new Name();

    public Profile() {
    }

    public Profile(ProfileId profileId, Age age, GenderType genderType, Name name) {
        this.profileId = profileId;
        this.age = age;
        this.genderType = genderType;
        this.name = name;
    }

    public Profile patchId(ProfileId newId) {
        return new Profile(newId, this.age, this.genderType, this.name);
    }

    public ProfileId getProfileId() {
        return profileId;
    }

    public Age getAge() {
        return age;
    }

    public GenderType getGenderType() {
        return genderType;
    }

    public Name getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return Objects.equals(profileId, profile.profileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileId);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "profileId=" + profileId +
                ", age=" + age +
                ", genderType=" + genderType +
                ", name=" + name +
                '}';
    }
}
