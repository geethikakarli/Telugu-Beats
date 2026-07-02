package com.music;

public class Song {
    private String name;
    private String mood;
    private String url;
    private String language;

    public Song(String name, String mood, String url, String language) {
        this.name = name;
        this.mood = mood;
        this.url = url;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "- " + name;
    }
}
