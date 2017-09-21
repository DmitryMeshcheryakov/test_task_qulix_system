package by.insight.test_task_qulix_system.di.component;


import javax.inject.Singleton;

import by.insight.test_task_qulix_system.di.module.AppModule;
import by.insight.test_task_qulix_system.di.module.NetModule;
import by.insight.test_task_qulix_system.viewmodel.SearchViewModel;
import by.insight.test_task_qulix_system.viewmodel.TrendsViewModel;
import dagger.Component;


@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {

    void inject(TrendsViewModel trendsViewModel);
    void inject(SearchViewModel searchViewModel);
}
