package com.example.juliod07.news_reader_app.Model;

/**
 * Created by JulioD07 on 3/8/2018.
 */

public class Icon {
    private String Url;
    private int width,height,bytes;
    private String format,shalsuml;
    private Object error;


    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getShalsuml() {
        return shalsuml;
    }

    public void setShalsuml(String shalsuml) {
        this.shalsuml = shalsuml;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }
}
