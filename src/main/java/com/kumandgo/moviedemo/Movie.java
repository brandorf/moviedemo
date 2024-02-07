package com.kumandgo.moviedemo;

import java.util.Date;

public class Movie
{
    public String imdbID;
    public String title;
    public String year;
    public String rated;
    public Date released;
    public String runtime;
    public String genre;
    public String director;
    public String actors;
    public String plot;
    public String language;
    public String country;
    public String poster;
    public String imdbRating;
    public String owner;

    @Override
    public String toString()
    {
        return String.format("%s - %s", this.title, this.imdbID);
    }
}
