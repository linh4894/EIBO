package presentation.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class PlayerView extends BorderPane{
	
	public final double DISTANCE = 10;
	public Button playlistButton;
	public Button settingButton;
	
	public PlayerView() {
		Insets sameInsets = new Insets(10);
		
		//leftBox setup
		HBox leftBox = new HBox();
		Button playlist = new Button ("Playlist");
		playlist.setId("playlist-button");
		
		leftBox.getChildren().addAll(playlist);
		leftBox.setAlignment(Pos.BASELINE_CENTER);
		leftBox.setPadding(sameInsets);
		leftBox.setStyle("-fx-background-color: white;");
	
		this.setLeft(leftBox);
		
		//rightBox setup
		HBox rightBox = new HBox();
		Button setting = new Button ("Setting");
		rightBox.getChildren().addAll(setting);
		rightBox.setAlignment(Pos.BASELINE_CENTER);
		rightBox.setPadding(sameInsets);
		rightBox.setStyle("-fx-background-color: white;");
		
		this.setRight(rightBox);
		
		//centerBox setup
		VBox centerBox = new VBox();
		
		//Cover Image setup
		Image image = new Image(getClass().getResourceAsStream("")); 
		//Path:/EIBO/src/data/images/img-test-1.jpg
		//Link Error make the Input Stream Null Error -> Need Fix
		ImageView imageView = new ImageView(image);
		//ImageViewPane imagePane = new ImageViewPane(imageView);
		
		//nameBox setup
		VBox nameBox = new VBox();
		
		Label songName = new Label("Song Name");
		Label artistName = new Label("Artist Name");
		
		nameBox.getChildren().addAll(songName, artistName);
		
		nameBox.setPadding(sameInsets);
		nameBox.setAlignment(Pos.BASELINE_CENTER);
		nameBox.setSpacing(DISTANCE);
		
		//centerBox.getChildren().addAll(imagePane, nameBox);
		centerBox.setAlignment(Pos.BASELINE_CENTER);
		centerBox.setPadding(sameInsets);
		centerBox.setStyle("-fx-background-color: white;");
		this.setCenter(centerBox);
		
		//bottonBox setup
		VBox bottomBox = new VBox();
		
		//Music-Process-Bar setup
		HBox musicBar = new HBox();
		
		ProgressBar musicProgress = new ProgressBar();
		Text totalTime = new Text("Total Time");
		
		musicBar.getChildren().addAll(musicProgress, totalTime);
		
		musicBar.setAlignment(Pos.BASELINE_CENTER);
		musicBar.setSpacing(DISTANCE);
		
		//controlBox Setup
		HBox controlBox = new HBox();
		Button play = new Button("play");
		Button pause = new Button("pause");
		Button skip = new Button ("skip");
		Button skipBack = new Button ("skip back");
		Button shuffle = new Button ("shuffle"); 
		Button repeat = new Button("repeat");
		
		controlBox.getChildren().addAll(skipBack, play, skip, shuffle, repeat);
		
		controlBox.setPadding(sameInsets);
		controlBox.setAlignment(Pos.BASELINE_CENTER);
		controlBox.setSpacing(DISTANCE);
		
		bottomBox.getChildren().addAll(musicBar, controlBox);
		bottomBox.setAlignment(Pos.BASELINE_CENTER);
		bottomBox.setPadding(sameInsets);
		bottomBox.setStyle("-fx-background-color: white;");
		this.setBottom(bottomBox);
		
		BorderPane.setMargin(leftBox, new Insets(0,5,0,5));
		BorderPane.setMargin(rightBox, new Insets(0,5,0,5));
		BorderPane.setMargin(bottomBox, new Insets(5,0,5,0));
		
		this.getStylesheets().add(getClass().getResource("iconsStyle.css").toExternalForm());
	}
}
