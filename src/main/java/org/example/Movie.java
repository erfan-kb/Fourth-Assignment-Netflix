package org.example;

import java.util.ArrayList;

class Movie extends TVShow {
    /*
     *Movie is extended from TVShow and has extra attribute length.
     */
    public Movie(String title,String genre,int releaseYear,double imdbScore,int duration)
    {
        super(title,genre,releaseYear,imdbScore,duration);
    }
}
