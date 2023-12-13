package edu.ics4u.ica;



public class AudioPlayer implements MediaPlayer {
       MediaAdapter mediaAdapter; 

   @Override
   public void play(String audioType, String fileName) {		

      //support intégré pour lire des fichiers de musique mp3
      if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("Playing mp3 file. Name: " + fileName);			
      } 
      
      //mediaAdapter  est entrain de donne du support à d'autre forme de fichiers
      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
      }
      
      else{
         System.out.println("Invalid media. " + audioType + " format not supported");
      }
   } 
}
