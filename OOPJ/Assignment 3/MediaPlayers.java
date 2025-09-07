interface AudioPlayer{
	void playAudio(String song);
}

interface VideoPlayer{
	void playVideo(String movie);
}

class MediaPlayer implements AudioPlayer,VideoPlayer{
	
	@Override
	public void playAudio(String song){
		System.out.println("Playing Audio: "+ song);
	}
	
	@Override
	public void playVideo(String movie){
		System.out.println("Playing Audio: "+ movie);
	}
	
}

class MediaPlayers{
	public static void main(String args[]){
		MediaPlayer mp = new MediaPlayer();
		
		mp.playAudio("Shape of you");
		mp.playVideo("Inception");
	}
}