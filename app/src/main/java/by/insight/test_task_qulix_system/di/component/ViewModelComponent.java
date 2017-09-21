package by.insight.test_task_qulix_system.di.component;


import javax.inject.Singleton;

import by.insight.test_task_qulix_system.di.module.AppModule;
import by.insight.test_task_qulix_system.di.module.ViewModelModule;
import by.insight.test_task_qulix_system.view.fragments.SearchFragment;
import by.insight.test_task_qulix_system.view.fragments.TrendsFragment;
import dagger.Component;

@Singleton
@Component(modules = {ViewModelModule.class, AppModule.class})
public interface ViewModelComponent {

    void inject(TrendsFragment trendsFragment);

    void inject(SearchFragment searchFragment);
}
