package com.danielkim.soundrecorder.Model;

public class LocationModel {

    String lat;
    String lang;
    String clientId;

    public LocationModel(String lat, String lang, String clientId) {
        this.lat = lat;
        this.lang = lang;
        this.clientId = clientId;
    }

    public LocationModel() {
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
