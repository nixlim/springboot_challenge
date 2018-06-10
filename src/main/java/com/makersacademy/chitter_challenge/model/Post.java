package com.makersacademy.chitter_challenge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Post {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String content;
    private String user;

    private Post() {}

    public Post(String content, String user) {
        this.content = content;
        this.user = user;
    }

}
