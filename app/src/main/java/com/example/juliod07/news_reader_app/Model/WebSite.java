package com.example.juliod07.news_reader_app.Model;

import java.util.List;



/**
 * Created by JulioD07 on 3/4/2018.
 */

public class WebSite {
    public String status;
    private List<Sources> sources;


    public WebSite() {
    }

    public WebSite(String status, List<Sources> sources) {
        this.status = status;
        this.sources = sources;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Sources> getSources() {
        return sources;
    }

    public void setSources(List<Sources> sources) {
        this.sources = sources;
    }


}
