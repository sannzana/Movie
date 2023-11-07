package com.example.tesst;

import java.sql.Date;
import java.time.Duration;

public class moviesData {

private Integer id;
    private String title;
    private String genre;
    private String duration;
    private Date date;
    private String image;
    private String director;
    private String current;


    public moviesData(Integer id,String title, String genre, String duration, String image ,Date date,String director, String current) {
       this.id=id;
        this.title=title;
       this.date=date;
       this.duration=duration;
       this.genre=genre;
       this.image=image;
       this.director=director;
       this.current=current;
       this.current=current;

    }


    public String getCurrent() {
        return current;
    }

    public String getDuration()
    {
        return duration;

    }
    public String getGenre()
    {
        return genre;

    }

    public Integer getId() {
        return id;
    }

    public String getImage()
    {
        return image;

    }
    public String getTitle()
    {
        return title;

    }
    public String getDirector()
    {
        return director;

    }
    public  Date getDate()
    {
        return date;
    }





}
