package edu.ics4u.ica;

public class MediaAdapter implements MediaPlayer {
   AdvanceMediaPlayer advanceMusicPlayer;

   public MediaAdapter(String audioType){
      // Si l'utilisateur décide de lance le fichier avec VLC
      if(audioType.equalsIgnoreCase("vlc") ){
         advanceMusicPlayer = new VlcPlayer();			
          // Si l'utilisateur décide de lance le fichier avec MP4  
      }else if (audioType.equalsIgnoreCase("mp4")){
         advanceMusicPlayer = new Mp4Player();
      }	
   }

   @Override
   public void play(String audioType, String fileName) {
   
      if(audioType.equalsIgnoreCase("vlc")){
         advanceMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         advanceMusicPlayer.playMp4(fileName);
      }
   }

}
