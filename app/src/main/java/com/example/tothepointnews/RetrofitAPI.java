package com.example.tothepointnews;

import com.example.tothepointnews.models.news.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitAPI {
    String TOP_HEADLINES = "/v2/top-headlines";

    @GET(TOP_HEADLINES)
    Call<News>getAllNews(
        @Query("country") String country,
        @Query("excludeDomains") String excludeDomains,
        @Query("sortBy") String sortBy,
        @Query("apiKey") String apiKey
    );

    @GET(TOP_HEADLINES)
    Call<News>getNewsByCategory(
        @Query("country") String country,
        @Query("category") String category,
        @Query("apiKey") String apiKey
    );
}
