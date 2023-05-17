package ex08;

import java.util.HashMap;
import java.util.Map;

interface playListresume {
   void play(String nowPlaySong);
   void pause();
   void resume();
   void previousTrack(String nowPlaySong);
   void nextTrack(String nowPlaySong);
}

interface tunningVol {
   void volumeUp();
   void volumeDown();   
   void nowVolumevalue();
   void mute();
   final int MAX_VOLUME = 100;
   final int MIN_VOLUME = 0;
}

interface repeatPlayBack {
   void repeatPlayBackAll();
   void repeatPlayBackOne();
}

public class PlayFunction implements playListresume, tunningVol, repeatPlayBack{
   
   Map<Integer, String> playList = new HashMap<>();
   
   int[] songNum = new int[100];
   
   String[] songName = new String[100];
   
   String nowPlaySong;
   
   boolean flag = true;
   
   int volume = 46;
   
   @Override
   public void volumeUp() {
      if(volume < MAX_VOLUME) { 
         volume++;
         System.out.println("volume : "+volume);
      }
   }
   
   @Override
   public void volumeDown() {
      if(volume > MIN_VOLUME) {
         volume--;
         System.out.println("volume : "+volume);
      }
   }
   
   @Override
   public void nowVolumevalue() {
      System.out.println("volume : "+volume);
   }
   
   @Override
   public void mute() {
      volume = MIN_VOLUME;
      System.out.println(volume);
   }
   
   @Override
   public void play(String nowPlaySong) {
      this.nowPlaySong = nowPlaySong;
      System.out.println(nowPlaySong+"를 재생합니다.");
   }
   
   @Override
   public void pause() {
      System.out.println("노래 멈춤!");
   }
   
   @Override
   public void resume() {
      System.out.println("노래 재생");
      System.out.println("현재 노래 : "+this.nowPlaySong);
   }
   
   @Override
   public void previousTrack(String nowPlaySong) {
      System.out.println("이전 노래 재생");
      this.nowPlaySong = nowPlaySong;
      this.nowPlaySong = playList.get(-1);
      System.out.println("현재 노래 : "+ this.nowPlaySong);
   }
   
   @Override
   public void nextTrack(String nowPlaySong) {
      System.out.println("다음 노래 재생");
      this.nowPlaySong = nowPlaySong;
      this.nowPlaySong = playList.get(+1);
      System.out.println("현재 노래 : "+ this.nowPlaySong);
   }

   @Override
   public void repeatPlayBackAll() {
      for(int i = 0; i<100; i++) {
         nowPlaySong = playList.get(i);
      }
      System.out.println("전체 노래 반복 재생");
   }

   @Override
   public void repeatPlayBackOne() {
      System.out.println("현재 노래 반복 재생");
   }

   
}
