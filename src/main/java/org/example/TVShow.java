package org.example;

import java.util.ArrayList;

import java.util.ArrayList;

class TVShow {
    private String title;
    private String genre;
    private int releaseYear;
    private double imdbScore;
    private double duration;

    //private ArrayList<String> cast;

    public TVShow(String title, String genre, int releaseYear, double imdbScore, int duration) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.imdbScore = imdbScore;
        this.duration = duration;
        //this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getImdbScore() {
        return imdbScore;
    }

    public double getDuration() {
        return duration;
    }
}
