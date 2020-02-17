package jp.co.actier.lt.javalin.application.profile;

import jp.co.actier.lt.javalin.domain.profile.Profile;
import jp.co.actier.lt.javalin.domain.profile.ProfileRepository;
import jp.co.actier.lt.javalin.infrastructure.ProfileInMemoryDataSource;

public class CreateProfile {
    private ProfileRepository repository = ProfileInMemoryDataSource.initialize();

    public Profile execute(Profile profile) {
        return repository.save(profile);
    }
}
