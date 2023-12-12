package main.java.edu.ics4u.ica;

public class MediaAdapter implements MediaPlayer {
   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType){
      // Si l'utilisateur décide de lance le fichier avec VLC
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();			
          // Si l'utilisateur décide de lance le fichier avec MP4  
      }else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }	
   }

   @Override
   public void play(String audioType, String fileName) {
   
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }

}
