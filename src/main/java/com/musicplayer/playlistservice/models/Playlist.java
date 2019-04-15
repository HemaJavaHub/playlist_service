package com.musicplayer.playlistservice.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @ElementCollection
    private List<String> songlistIDs;

    public Playlist() {
        songlistIDs = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSonglist() {
        return songlistIDs;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void addSong(String songId) {
        this.songlistIDs.add(songId);
    }

    public void removeSong(Integer songId) {
        this.songlistIDs.remove(songId);
    }

    public void moveSong(int currentIndex, int newIndex) {
        String songToMove = this.songlistIDs.get(currentIndex);
        this.songlistIDs.remove(songToMove);
        this.songlistIDs.add(newIndex,songToMove);
    }


}