package main.java.edu.ics4u.ica;
public class Mp4Player implements AdvancedMediaPlayer {
    
   @Override
   public void playVlc(String fileName) {
      //ne fait rien
   }

   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);		
   }
}
