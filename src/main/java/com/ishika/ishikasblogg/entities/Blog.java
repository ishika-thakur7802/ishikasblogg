package com.ishika.ishikasblogg.entities;
import jakarta.persistence.*;
import lombok.*;



@Entity
@Data
public class Blog {
    @Id @GeneratedValue
    private Long id;

    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    private String imageUrl;

    @ManyToOne
    private User author;

    private int likes;
}

