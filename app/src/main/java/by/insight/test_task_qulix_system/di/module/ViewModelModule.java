package by.insight.test_task_qulix_system.di.module;

import android.app.Application;

import javax.inject.Singleton;

import by.insight.test_task_qulix_system.viewmodel.SearchViewModel;
import by.insight.test_task_qulix_system.viewmodel.TrendsViewModel;
import dagger.Module;
import dagger.Provides;

@Module
public class ViewModelModule {

    @Singleton
    @Provides
    TrendsViewModel provideTrendsViewModel(Application application)
    {
        return new TrendsViewModel(application);
    }

    @Singleton
    @Provides
    SearchViewModel provideSearchViewModel(Application application)
    {
        return new SearchViewModel(application);
    }

}
