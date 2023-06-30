package com.max.spring.inversion_of_control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music;
    private Music music1;

    public MusicPlayer(@Qualifier("classicalMusic") Music music, @Qualifier("rockMusic") Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    public String playMusic() {
        return "Playing: " + music.getSong() + ", " + music1.getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
