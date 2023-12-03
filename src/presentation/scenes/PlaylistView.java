package presentation.scenes;

import java.util.List;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;

public class PlaylistView extends TilePane{
	
	public final double DISTANCE = 10;
	public Button playlistButton;
	public Button settingButton;
	private List<String> songs;
	private int size = 5;
	
	public PlaylistView() {
		HBox leftBox = new HBox();
		
		TilePane playlistNameBox = new TilePane();
		Label playlistName = new Label("Playlist Test");
		Button playerButton = new Button("Player");
		
		playlistNameBox.setHgap(DISTANCE);
		playlistNameBox.setOrientation(Orientation.HORIZONTAL);
		playlistNameBox.getChildren().addAll(playlistName, playerButton);
		
		ListView playlist = new ListView();
		for (int i = 0; i < size; i++) {
			playlist.getItems().add("name");
		}
		HBox playlistBox = new HBox(playlist);
		
		leftBox.getChildren().addAll(playlistNameBox, playlistBox);
		
		HBox rightBox = new HBox();
		
		this.setHgap(DISTANCE);
		this.setOrientation(Orientation.HORIZONTAL);
		this.getChildren().addAll(leftBox, rightBox);
	}
	
	
}
