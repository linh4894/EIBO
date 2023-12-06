package business;

import java.util.ArrayList;

public class PlaylistManager {
	
	private Playlist playlist;
	private String playlistName;
	private String playlistFile;
	
	private ArrayList<Track> tracks;
	
	
	public PlaylistManager() {
		playlistName = "test";
		playlistFile = "";
		///EIBO/src/data/playlist/test.m3u
		playlist = new Playlist (playlistName, playlistFile);
		
		tracks = playlist.getTracks();
	}
	
	public Playlist getPlaylist(String name) {
		
		return playlist;
	}
	
	public String getPlaylistName() {
		return playlistName;
	}
	
	public ArrayList<String> getTrackName(){
		return playlist.getTrackName();
	}
}
