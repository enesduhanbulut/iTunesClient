package com.duhan.itunesclient.api;

import com.duhan.itunesclient.data.Artist;
import com.duhan.itunesclient.data.ITunesResult;
import com.duhan.itunesclient.data.Track;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import io.reactivex.rxjava3.core.Single;
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
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        return new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .client(new OkHttpClient.Builder().addInterceptor(logging).build())
                .build()
                .create(ITunesService.class);
    }

    @GET("search")
    Single<ITunesResult<Artist>> searchArtist(@Query("term") String query, @Query("entity") String entity, @Query("limit") int limit, @Query("offset") int offset);

    @GET("search")
    Single<ITunesResult<Track>> searchTrack(@Query("term") String query, @Query("entity") String entity, @Query("limit") int limit, @Query("offset") int offset);
}
