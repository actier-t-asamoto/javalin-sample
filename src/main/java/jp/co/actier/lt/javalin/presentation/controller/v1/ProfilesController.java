package jp.co.actier.lt.javalin.presentation.controller.v1;

import io.javalin.apibuilder.CrudHandler;
import io.javalin.http.Context;
import jp.co.actier.lt.javalin.application.profile.CreateProfile;
import jp.co.actier.lt.javalin.application.profile.DeleteProfile;
import jp.co.actier.lt.javalin.application.profile.FindProfile;
import jp.co.actier.lt.javalin.application.profile.GetAllProfiles;
import jp.co.actier.lt.javalin.domain.profile.Profile;
import jp.co.actier.lt.javalin.domain.profile.ProfileId;
import jp.co.actier.lt.javalin.hepler.JSONUtil;
import org.jetbrains.annotations.NotNull;

public class ProfilesController implements CrudHandler {
    @Override
    public void create(@NotNull Context context) {
        Profile profile = JSONUtil.deserialize(context.body(), Profile.class);
        Profile created = new CreateProfile().execute(profile);
        context.json(created);
    }

    @Override
    public void delete(@NotNull Context context, @NotNull String s) {
        context.json(new DeleteProfile().execute(new ProfileId(s)));
    }

    @Override
    public void getAll(@NotNull Context context) {
        context.json(new GetAllProfiles().execute());
    }

    @Override
    public void getOne(@NotNull Context context, @NotNull String s) {
        context.json(new FindProfile().execute(new ProfileId(s)));
    }

    @Override
    public void update(@NotNull Context context, @NotNull String s) {
        Profile profile = JSONUtil.deserialize(context.body(), Profile.class);
        Profile updated = new CreateProfile().execute(profile.patchId(new ProfileId(s)));
        context.json(updated);
    }
}
