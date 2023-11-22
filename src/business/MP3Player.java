package business;
import de.hsrm.mi.eibo.simpleplayer.SimpleAudioPlayer;
import de.hsrm.mi.eibo.simpleplayer.SimpleMinim;

public class MP3Player {
	
	private SimpleMinim minim;
	private SimpleAudioPlayer audioPlayer;
	private Playlist actPlaylist;
	private Track actTrack;
	private int trackNo;
	
	
	public MP3Player() {
		minim = new SimpleMinim(true);
		audioPlayer = new SimpleAudioPlayer(null, true);
	}
	
	public void setPlaylist(Playlist list) {
		actPlaylist = list;
	}
	
	public void selectTrack(int no) {
		actTrack = actPlaylist.getTrack(no);
	}
	
	
	public void play(String fileName) {
		audioPlayer = minim.loadMP3File(fileName);
		play();
	}
	
	public void play() {
		audioPlayer.play();
	}
	
	public void pause() {
		audioPlayer.pause();
	}
	
	//trackNo +1 -> play
	public void skip() {
		
	}
	
	
	//trackNo -1 -> play
	public void skipBack() {
		
	}
	
	public void volume(float value) {
		audioPlayer.setVolume(value); //minim error, Volume is not supported
		audioPlayer.setGain(value); //not change the value
		System.out.println(audioPlayer.getGain());
	}
}
