package com.musicplayer.playlistservice.musicplayerrestapi.TestUtils;



import com.musicplayer.playlistservice.models.Playlist;
import com.musicplayer.playlistservice.models.Song;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPlaylist{

    private static Playlist playlist;
    private static List<String> songIds = new ArrayList<String>(Arrays.asList("5caf47541691e064dcb040dd"));


    public static Playlist getTestPlaylist(){
        playlist = new Playlist();
        playlist.setName("JMoney's Top 20");

        songIds.forEach((songId) -> playlist.addSong(songId));
        return playlist;
    }

}
