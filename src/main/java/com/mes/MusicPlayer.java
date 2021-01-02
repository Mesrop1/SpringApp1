package com.mes;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    //realisation IoC
    List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC using setter
    public void setMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    //IoC using constructor
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        for(Music music : musicList) {
           music.getSong();
        }
    }
}
