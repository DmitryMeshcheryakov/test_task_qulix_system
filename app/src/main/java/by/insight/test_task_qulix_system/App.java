package by.insight.test_task_qulix_system;

import android.app.Application;

import by.insight.test_task_qulix_system.di.component.DaggerNetComponent;
import by.insight.test_task_qulix_system.di.component.DaggerViewModelComponent;
import by.insight.test_task_qulix_system.di.component.NetComponent;
import by.insight.test_task_qulix_system.di.component.ViewModelComponent;
import by.insight.test_task_qulix_system.di.module.AppModule;
import by.insight.test_task_qulix_system.di.module.NetModule;
import by.insight.test_task_qulix_system.di.module.ViewModelModule;


public class App extends Application {

    private NetComponent mNetComponent;
    private ViewModelComponent mViewModelComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initNetComponent();
        initViewModelComponent();

    }

    private void initNetComponent()
    {
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule(Constants.BASE_URL))
                .build();
    }


    private void initViewModelComponent()
    {
        mViewModelComponent= DaggerViewModelComponent.builder()
                .appModule(new AppModule(this))
                .viewModelModule(new ViewModelModule())
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
    public ViewModelComponent getViewModelComponent() {return mViewModelComponent; }
}
