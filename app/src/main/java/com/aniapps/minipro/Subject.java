package com.aniapps.minipro;

import java.io.Serializable;

/**
 * Created by USER on 02-04-2017.
 */
public class Subject //implements Serializable
 {
    private String title;

    public Subject()
    { }

    public Subject(String title)
    { this.title = title ;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
