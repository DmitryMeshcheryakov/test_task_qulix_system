package by.insight.test_task_qulix_system.data;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;


public class ResponseCacheInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder()
                .header("Cache-Control", "public, max-age=" + 60)
                .build();
    }
}
