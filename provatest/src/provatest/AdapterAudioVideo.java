package provatest;

public class AdapterAudioVideo implements VideoGeral {
	
	private Audio audio;
	 
	public AdapterAudioVideo(Audio other){
	    this.audio = other;
	}
	
	@Override
	public void RodarVideo() {
		audio.RodarAudio();
		
	}

	@Override
	public void GravarVideo() {
		audio.RodarAudio();
		
	}

}
