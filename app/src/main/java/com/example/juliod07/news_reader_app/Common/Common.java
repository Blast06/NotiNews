package com.example.juliod07.news_reader_app.Common;

import com.example.juliod07.news_reader_app.Interface.IconBetterIdeaService;
import com.example.juliod07.news_reader_app.Interface.NewsService;
import com.example.juliod07.news_reader_app.Model.IconBetterIdea;
import com.example.juliod07.news_reader_app.Remote.IconBetterIdeaClient;
import com.example.juliod07.news_reader_app.Remote.RetrofitClient;

/**
 * Created by JulioD07 on 3/5/2018.
 */

public class Common {
    private static final String BASE_URL = "https://newsapi.org/";

    public static final String API_KEY = "404a0d5ecad249dfbe666146d2927e00";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient(BASE_URL).create(IconBetterIdeaService.class);
    }

}
