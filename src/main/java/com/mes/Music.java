package com.mes;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.MalformedURLException;

public interface Music {
    void getSong() throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException;
}
