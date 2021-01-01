package com.mes;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class MusicPlayer {

    //realisation IoC
    private Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        music.getSong();
    }
}
