package by.insight.test_task_qulix_system.data;


import by.insight.test_task_qulix_system.model.GifObject;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GifImageAPI {
    @GET("v1/gifs/trending")
    Observable<GifObject> getGifImagesTrending(@Query("api_key") String apiKey);

    @GET("v1/gifs/search")
    Observable<GifObject> getSearchGifs(@Query("q") String query, @Query("api_key") String apiKey);
}