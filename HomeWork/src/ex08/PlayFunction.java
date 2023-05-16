package ex08;

public class PlayFunction {
	

	int[] inputCd = new int[100];
	
//	for(int i =0; i<100; i++)
//		inputCd[i] = i+1;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	
	int volume = 46;
	
	
	
	void volumeUp() {
		if(volume < MAX_VOLUME) 
			volume++;
		System.out.println(volume);
	}
	
	void volumeDown() {
		if(volume > MIN_VOLUME)
			volume--;
		System.out.println(volume);
	}
	
	void pause() {
		System.out.println("노래 멈춤!");
	}
	
	void resume() {
		System.out.println("노래 재생");
	}
	
	void previousTrack() {
		System.out.println("이전 노래 재생");
	}
	
	void nextTrack() {
		System.out.println("다음 노래 재생");
	}
	
}

