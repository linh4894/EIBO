package business;

import java.util.ArrayList;
import java.util.List;

public class PlaylistManager {
	
	private Playlist playlist;
	private String playlistName;
	private String playlistFile;
	
	private List <Playlist> playlists;
	
	
	public PlaylistManager() {
		playlistName = "test";
		playlistFile = "/EIBO/src/data/playlist/test.m3u";
		playlist = new Playlist (playlistName, playlistFile);
		
		playlists = new ArrayList<>();
	}
	
	public Playlist getPlaylist(String name) {
		
		return playlist;
	}
	
	
}
