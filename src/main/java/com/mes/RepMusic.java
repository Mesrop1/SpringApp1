package com.mes;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class RepMusic  implements Music{

    @Override
    public void getSong() throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException {
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("mp3_files/rep.wav"));
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        Thread.sleep(clip.getMicrosecondLength()/1000);
    }
}
