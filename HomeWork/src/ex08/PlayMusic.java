package ex08;

public class PlayMusic extends PlayFunction {

   public static void main(String[] args) {
      
      PlayFunction pf = new PlayFunction();
      
      for(int i = 0; i<pf.songNum.length; i++)
         pf.songNum[i] = i+1;
      
      for(int i = 0; i<pf.songName.length; i++)
         pf.songName[i] = i+1+"번째 곡";
      
      for(int i = 0; i<pf.songNum.length; i++)
         pf.playList.put(pf.songNum[i], pf.songName[i]);
      
      pf.nowVolumevalue();   //현재 볼륨 보여주기
      pf.volumeUp();   // 볼륨 Up
      pf.volumeDown();   //볼륨 Down 
      pf.play(pf.playList.get(1)); //노래 시작
      pf.resume(); // 노래 재시작
      pf.pause(); // 노래 stop
      pf.nextTrack(pf.playList.get(1)); // 다음 노래 재생
      pf.previousTrack(pf.playList.get(1)); // 이전 노래 재생
      pf.repeatPlayBackAll(); // 전체 노래 반복 재생
      pf.repeatPlayBackOne(); // 한곡 반복 재생
      
      
   }

}