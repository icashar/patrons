package main.java.edu.ics4u.ica;
public class Mp4Player implements AdvancedMediaPlayer {
    
   @Override
   public void playVlc(String fileName) {
      // informs the user that that file cannot be used
      System.out.println("Cannnot play vlc files. Unsupported format for MP4 player: "+fileName);
   }

   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);		
   }
}
