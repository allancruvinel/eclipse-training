package provatest;

public class Main {

	public static void main(String[] args) {
		Mp4 minecraftgameplay = new Mp4();
	     minecraftgameplay.GravarVideo();
	     minecraftgameplay.RodarVideo();


	     AdapterAudioVideo minecraftAudio = new AdapterAudioVideo( new Wav() );
	     minecraftAudio.RodarVideo();

	}

}
