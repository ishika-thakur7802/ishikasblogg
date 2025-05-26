package com.ishika.ishikasblogg.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@Getter
@Setter
public class Comments {
    @Id @GeneratedValue
    private Long id;

    private String content;

    @ManyToOne
    private User user;

    @ManyToOne
    private Blog blog;

    @ManyToOne
    private Comments parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Comments> replies;
}

