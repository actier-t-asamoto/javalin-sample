package jp.co.actier.lt.javalin;

import io.javalin.Javalin;
import io.javalin.apibuilder.ApiBuilder;
import jp.co.actier.lt.javalin.presentation.controller.v1.ProfilesController;

public class JavalinSampleApps {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(5000);
        app.routes(() -> {
            ApiBuilder.path("/api/v1", () -> {
                ApiBuilder.crud("/profile/:id", new ProfilesController());
            });
        });
    }
}
