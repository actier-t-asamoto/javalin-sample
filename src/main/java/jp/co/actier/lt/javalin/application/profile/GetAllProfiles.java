package jp.co.actier.lt.javalin.application.profile;

import jp.co.actier.lt.javalin.domain.profile.ProfileRepository;
import jp.co.actier.lt.javalin.domain.profile.Profiles;
import jp.co.actier.lt.javalin.infrastructure.ProfileInMemoryDataSource;

public class GetAllProfiles {
    private ProfileRepository repository = ProfileInMemoryDataSource.initialize();

    public Profiles execute() {
        return repository.getAll();
    }

}
