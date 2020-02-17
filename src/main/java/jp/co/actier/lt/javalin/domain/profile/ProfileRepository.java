package jp.co.actier.lt.javalin.domain.profile;

public interface ProfileRepository {
    Profile save(Profile profile);
    Profile find(ProfileId id);
    Profiles getAll();
    ProfileId delete(ProfileId id);
}
