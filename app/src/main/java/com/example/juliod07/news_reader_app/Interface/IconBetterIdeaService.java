package com.example.juliod07.news_reader_app.Interface;

import com.example.juliod07.news_reader_app.Model.IconBetterIdea;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by JulioD07 on 3/8/2018.
 */

public interface IconBetterIdeaService {
    @GET
    Call<IconBetterIdea>getIconUrl(@Url String url);
}
