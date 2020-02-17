package jp.co.actier.lt.javalin.application.profile;

import jp.co.actier.lt.javalin.domain.profile.Profile;
import jp.co.actier.lt.javalin.domain.profile.ProfileId;
import jp.co.actier.lt.javalin.domain.profile.ProfileRepository;
import jp.co.actier.lt.javalin.infrastructure.ProfileInMemoryDataSource;

public class FindProfile {
    private ProfileRepository repository = ProfileInMemoryDataSource.initialize();

    public Profile execute(ProfileId id) {
        return repository.find(id);
    }
}
