package jp.co.actier.lt.javalin.application.profile;

import jp.co.actier.lt.javalin.domain.profile.ProfileId;
import jp.co.actier.lt.javalin.domain.profile.ProfileRepository;
import jp.co.actier.lt.javalin.infrastructure.ProfileInMemoryDataSource;

public class DeleteProfile {
    private ProfileRepository repository = ProfileInMemoryDataSource.initialize();

    public ProfileId execute(ProfileId id) {
        return repository.delete(id);
    }
}
