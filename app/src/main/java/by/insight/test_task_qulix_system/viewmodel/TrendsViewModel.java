package by.insight.test_task_qulix_system.viewmodel;

import android.content.Context;
import android.databinding.ObservableInt;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import by.insight.test_task_qulix_system.App;
import by.insight.test_task_qulix_system.Constants;
import by.insight.test_task_qulix_system.data.GifImageAPI;
import by.insight.test_task_qulix_system.model.Data;
import by.insight.test_task_qulix_system.model.GifObject;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;


public class TrendsViewModel extends BaseViewModel {

    public ObservableInt gifProgress;
    public ObservableInt gifTrendsRecycler;


    @Inject
    Retrofit mRetrofit;

    private List<Data> gifList;

    public TrendsViewModel(Context context) {
        super(context);
        this.gifList = new ArrayList<>();
        gifProgress = new ObservableInt(View.GONE);
        gifTrendsRecycler = new ObservableInt(View.GONE);
        ((App) context.getApplicationContext()).getNetComponent().inject(this);
    }

    public void loadTrendsGifList() {
        initializeViews();
        getCompositeDisposable().add(mRetrofit.create(GifImageAPI.class)
                .getGifImagesTrending(Constants.TOKEN)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::changeGifDataSet, this::handleError));
    }

    private void changeGifDataSet(GifObject gif) {
        gifList.addAll(gif.getData());
        setChanged();
        notifyObservers();
        gifProgress.set(View.GONE);
        gifTrendsRecycler.set(View.VISIBLE);

    }

    private void handleError(Throwable error) {
        Log.i("TrendsViewModel", error.getLocalizedMessage());
    }

    public List<Data> getGifList() {
        return gifList;
    }

    public void initializeViews() {
        gifTrendsRecycler.set(View.GONE);
        gifProgress.set(View.VISIBLE);
    }

}
