package by.insight.test_task_qulix_system.viewmodel;

import android.content.Context;
import android.databinding.ObservableInt;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import by.insight.test_task_qulix_system.App;
import by.insight.test_task_qulix_system.Constants;
import by.insight.test_task_qulix_system.data.GifImageAPI;
import by.insight.test_task_qulix_system.model.Data;
import by.insight.test_task_qulix_system.model.GifObject;
import by.insight.test_task_qulix_system.tools.RxSearch;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;


public class SearchViewModel extends BaseViewModel {

    public ObservableInt gifProgress;
    public ObservableInt gifRecycler;

    @Inject
    Retrofit mRetrofit;

    private List<Data> gifList;

    public SearchViewModel(Context context) {
        super(context);
        this.gifList = new ArrayList<>();
        gifProgress = new ObservableInt(View.GONE);
        gifRecycler = new ObservableInt(View.GONE);
        ((App) context.getApplicationContext()).getNetComponent().inject(this);
    }


    public void searchGifList(SearchView searchView) {

        getCompositeDisposable().add(RxSearch.fromSearchView(searchView)
                .debounce(300, TimeUnit.MILLISECONDS)
                .filter(item -> item.length() > 1)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(query -> {
                    gifProgress.set(View.VISIBLE);
                    gifRecycler.set(View.GONE);
                    loadSearchGifs(mRetrofit.create(GifImageAPI.class).getSearchGifs(query, Constants.TOKEN));
                }, this::handleError));
    }

    private void loadSearchGifs(io.reactivex.Observable<GifObject> gif) {
        gif.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(gifObject -> {
                    gifList.clear();
                    gifList.addAll(gifObject.getData());
                    setChanged();
                    notifyObservers();
                    gifProgress.set(View.GONE);
                    gifRecycler.set(View.VISIBLE);
                });
    }

    private void handleError(Throwable error) {
        Log.i("SearchViewModel", error.getLocalizedMessage());
    }

    public List<Data> getSearchGifList() {
        return gifList;
    }

}
