package com.example.demoweb.model;

import java.util.Date;

public class Post
{
    private String text;
    private Integer likes = 0;
    private Date creationDate;

    public Post(String text, Date creationDate)
    {
        this.text = text;
        this.creationDate = creationDate;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public Integer getLikes()
    {
        return likes;
    }

    public void setLikes(Integer likes)
    {
        this.likes = likes;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }
}
