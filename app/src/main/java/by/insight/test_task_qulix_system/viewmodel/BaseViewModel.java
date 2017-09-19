package by.insight.test_task_qulix_system.viewmodel;


import android.content.Context;
import java.util.Observable;
import io.reactivex.disposables.CompositeDisposable;

public class BaseViewModel extends Observable {

    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private Context context;

    public  BaseViewModel(Context context)
    {
        this.context = context;
    }
    private void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }

    }

    public void reset() {
        unSubscribeFromObservable();
        compositeDisposable = null;
        context = null;
    }

    public CompositeDisposable getCompositeDisposable() {
        return compositeDisposable;
    }

    public void setCompositeDisposable(CompositeDisposable compositeDisposable) {
        this.compositeDisposable = compositeDisposable;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
