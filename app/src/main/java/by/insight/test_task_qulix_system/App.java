package by.insight.test_task_qulix_system;

import android.app.Application;

import by.insight.test_task_qulix_system.di.component.DaggerNetComponent;
import by.insight.test_task_qulix_system.di.component.NetComponent;
import by.insight.test_task_qulix_system.di.module.AppModule;
import by.insight.test_task_qulix_system.di.module.NetModule;


public class App extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule(Constants.BASE_URL))
                .build();

    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
