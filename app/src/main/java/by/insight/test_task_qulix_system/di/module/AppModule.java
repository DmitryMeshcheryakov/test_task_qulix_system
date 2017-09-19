package by.insight.test_task_qulix_system.di.module;

import android.app.Application;

import javax.inject.Singleton;

import by.insight.test_task_qulix_system.App;
import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {
    private Application mApp;

    public AppModule(Application app) {
        this.mApp = app;
    }

    @Singleton
    @Provides
    Application provideApplication() {
        return mApp;
    }
}
