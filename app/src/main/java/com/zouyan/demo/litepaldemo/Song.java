package com.zouyan.demo.litepaldemo;

import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

/**
 * Created by Boosal on 2017/8/31.
 */

public class Song extends DataSupport {

    @Column(nullable = false)
    private String name;

    private int duration;

    @Column(ignore = true)
    private String uselessField;

    private Album album;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUselessField() {
        return uselessField;
    }

    public void setUselessField(String uselessField) {
        this.uselessField = uselessField;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
