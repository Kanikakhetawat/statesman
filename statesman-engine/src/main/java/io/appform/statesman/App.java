package io.appform.statesman;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by kanika.khetawat on 29/03/20
 */
public class App extends Application<AppConfig> {

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run(args);
    }

    @Override
    public void run(AppConfig appConfig, Environment environment) {

    }
}
