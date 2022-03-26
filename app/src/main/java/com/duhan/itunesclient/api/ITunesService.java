package com.duhan.itunesclient.api;

import com.duhan.itunesclient.data.ITunesResult;

import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import io.reactivex.rxjava3.core.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ITunesService {
    static ITunesService create() {
        final String API_URL = " https://itunes.apple.com/";
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .client(new OkHttpClient.Builder().addInterceptor(logging).build())
                .build()
                .create(ITunesService.class);
    }

    @GET("search")
    Observable<ITunesResult> search(@Query("term") String query, @Query("limit") int limit);
}
