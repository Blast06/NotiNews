package com.example.juliod07.news_reader_app.Model;

import java.util.List;

/**
 * Created by JulioD07 on 3/4/2018.
 */



public class Sources {

    private String id,name,description,url,category,language,country;
    private UrlsToLogos urlsToLogos;
    private List<String> sortByAvailable;

    public Sources(String id, String name, String description, String url, String category, String language, String country, UrlsToLogos urlsToLogos, List<String> sortByAvailable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.category = category;
        this.language = language;
        this.country = country;
        this.urlsToLogos = urlsToLogos;
        this.sortByAvailable = sortByAvailable;
    }

    public Sources(){

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public UrlsToLogos getUrlsToLogos() {
        return urlsToLogos;
    }

    public void setUrlsToLogos(UrlsToLogos urlsToLogos) {
        this.urlsToLogos = urlsToLogos;
    }

    public List<String> getSortByAvailable() {
        return sortByAvailable;
    }

    public void setSortByAvailable(List<String> sortByAvailable) {
        this.sortByAvailable = sortByAvailable;
    }


}
