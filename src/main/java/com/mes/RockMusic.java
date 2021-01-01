package com.mes;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class RockMusic implements Music{

    @Override
    public void getSong() throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("mp3_files/rock.wav"));
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        Thread.sleep(clip.getMicrosecondLength()/1000);
    }
}
