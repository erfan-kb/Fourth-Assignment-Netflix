package org.example;

import java.util.ArrayList;

class User {
    private String username;
    private String password;

    public ArrayList<TVShow> favTvShow  = new ArrayList<>();

    public ArrayList<TVShow> watchedTvShow = new ArrayList<>();

    public User(String username,String password){
        this.username = username;
        this.password = password;
    }
    public void Watch(TVShow tvShow)
    {
        watchedTvShow.add(tvShow);
    }


    public ArrayList<TVShow> searchByTitle(String title) {
        // Implement search by title in favorite shows  logic here
        ArrayList<TVShow> searchResult = new ArrayList<>();

        for (int i = 0; i < favTvShow.size(); i++) {
            if(favTvShow.get(i).getTitle().contains(title))
            {
                searchResult.add(favTvShow.get(i));
            }
        }
        return searchResult;
    }
    public ArrayList<TVShow> searchByGenre(String genre) {
        // Implement search by genre in favorite shows  logic here
        ArrayList<TVShow> searchResult = new ArrayList<>();
        for (int i = 0; i < favTvShow.size(); i++) {
            if(favTvShow.get(i).getGenre().equals(genre))
            {
                searchResult.add(favTvShow.get(i));
            }
        }
        return searchResult;
    }
    public ArrayList<TVShow> searchByReleaseYear(int year) {
        ArrayList<TVShow> searchResult = new ArrayList<>();

        for (int i = 0; i < favTvShow.size(); i++) {
            if(favTvShow.get(i).getReleaseYear() == year)
            {
                searchResult.add(favTvShow.get(i));
            }
        }
        return searchResult;
    }
    public void addToFavorites(TVShow show) {
        // Implement add to favorites logic here
        favTvShow.add(show);
    }
    public ArrayList<TVShow> viewFavorites() {
        return favTvShow;
    }
    public ArrayList<TVShow> viewWatchedHistory(){
        return watchedTvShow;
    }
    public ArrayList<TVShow> getRecommendations(NetflixService netflix) {
        //base on fav(genre) and watched
        ArrayList<String> genreOfFav = new ArrayList<>();
        for (int i = 0; i < favTvShow.size(); i++) {
            genreOfFav.add(favTvShow.get(i).getGenre());
        }
        ArrayList<String> genreOfWatched = new ArrayList<>();
        for (int i = 0; i < watchedTvShow.size(); i++) {
            genreOfWatched.add(watchedTvShow.get(i).getGenre());
        }
        genreOfWatched.addAll(genreOfFav);

        ArrayList<TVShow> recommendation = new ArrayList<>();
        for (int i = 0; i < genreOfWatched.size(); i++) {
            for (int j = 0; j < netflix.searchByGenre(genreOfWatched.get(i)).size(); j++) {
                recommendation.add(netflix.searchByGenre(genreOfWatched.get(i)).get(j));
            }
        }
        return recommendation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}