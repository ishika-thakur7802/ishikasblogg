package com.ishika.ishikasblogg.entities;
import jakarta.persistence.*;
import lombok.*;



@Entity

public class Blog {
    @Id @GeneratedValue
    private Long id;

    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    private String imageUrl;
    private int likes;



    public Blog() {
        // no-arg constructor for JPA & Jackson
    }

    public Blog(Long id, String title, String content, String imageUrl, int likes) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
//
    public String getContent() {
        return content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getLikes() {
        return likes;
    }

    public void setId(Long id)
    {
        this.id= id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

//
//    @ManyToOne
//    private User author;


}

