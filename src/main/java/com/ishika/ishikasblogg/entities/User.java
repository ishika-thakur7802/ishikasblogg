package com.ishika.ishikasblogg.entities;

import com.ishika.ishikasblogg.enums.role;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;


    @Entity
    @Data
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String email;
        private String password;

        @Enumerated(EnumType.STRING)
        private role role;

        @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
        private List<Blog> blogs;

        @ManyToMany
        @JoinTable(
                name = "user_liked_blogs",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "blog_id")
        )
        private Set<Blog> likedBlogs = new HashSet<>();

        @ManyToMany
        @JoinTable(
                name = "user_saved_blogs",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "blog_id")
        )
        private Set<Blog> savedBlogs = new HashSet<>();

        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<Comments> comments = new ArrayList<>();
    }




