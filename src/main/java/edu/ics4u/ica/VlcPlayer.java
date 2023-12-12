package main.java.edu.ics4u.ica;

public class VlcPlayer implements AdvanceMediaPlayer {
  @Override
  public void playVlc(String fileName) {
    System.out.println("Playing vlc file. Name: " + fileName);
  }

  // Doesn't do anything
  @Override
  public void playMp4(String fileName) {
    // informs the user that that file cannot be used
    System.out.println("Cannnot play MP4 files. Unsupported format for vlc player: " + fileName);
  }
}
