package edu.ics4u.ica;

import main.java.edu.ics4u.ica.AudioPlayer;// Pourquoi?


public class DemoAdpter extends AudioPlayer {
    public static void main(String[] args) {
     AudioPlayer audioPlayer = new AudioPlayer(); // cette partie ne marche pas

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
