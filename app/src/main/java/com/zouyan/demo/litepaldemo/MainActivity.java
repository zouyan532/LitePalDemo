package com.zouyan.demo.litepaldemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.litepal.crud.DataSupport;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Album album = new Album();
        album.setName("album");
        album.setPrice(10.99f);
        album.save();
        Song song1 = new Song();
        song1.setName("song1");
        song1.setDuration(320);
        song1.setAlbum(album);
        song1.save();
        Song song2 = new Song();
        song2.setName("song2");
        song2.setDuration(356);
        song2.setAlbum(album);
        song2.save();
        Album album1 = DataSupport.find(Album.class,1);
        Album album2 = new Album();
        album2.setPrice(1211212);
        album2.setName("a");
        album2.save();
        List<Album> albumList = DataSupport.findAll(Album.class);
        album1.setPrice(124.2f);
        album.update(1);
        List<Song> songs = DataSupport.findAll(Song.class);
        List<Song> songs1 = DataSupport.where("name like ?", "song%").order("duration").find(Song.class);
        Log.i("TAG","TAG");
    }
}
