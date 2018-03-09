package com.example.juliod07.news_reader_app.Interface;

import com.example.juliod07.news_reader_app.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by JulioD07 on 3/5/2018.
 */

public interface NewsService {
    @GET ("v2/sources?language=es&apiKey=404a0d5ecad249dfbe666146d2927e00")
    Call<WebSite> getSources();


}
