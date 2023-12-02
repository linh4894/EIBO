package application;

import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import presentation.scenes.PlayerView;
import presentation.scenes.PlaylistView;

public class MP3_App extends Application{
	
	private HashMap<String, Pane> scenes;
	private Stage mainWindow;
	private Scene mainScene;
	
	private Pane playerView;
	private Pane playlistView;
	
	public void init() {
		scenes = new HashMap<>();
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			/*
			 * this.playerView = new PlayerView();
			 * this.playlistView = new PlaylistView();
			 * mainWindow = primaryStage;
			 * Scene scene = new Scene();
			 * mainWindow.setScene(scene);
			 * 
			 * switchView(PLAYER);
			 * mainWindow.setTitle("Player");
			 * mainWindow.show();
			 * 
			 */
			//init Views
			//Pane root = new PlayerView();
			Pane root = new PlaylistView();
			
			//root = new PlayView();
			//scenes.put("playerView", root);
			//root = new PlaylistView();
			
			//init Scene
			Scene scene = new Scene(root, 1280, 800);
			
			mainWindow = primaryStage;
			mainScene = scene;
			
			primaryStage.setScene(scene);
			//primaryStage.setFullScreen(true);
			//primaryStage.setIconified(true);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void switchScene(String viewName) {
		if(mainScene != null) {
			Pane nextView = scenes.get(viewName);
			if(nextView != null) {
				mainScene.setRoot(nextView);
			}
			
		}
	}
	
	private void switchView(String name) {
		Scene scene = mainWindow.getScene();
		switch(name) {
		//case PLAYER:
			//scene.setRoot(playerView);
			//break;
		}
	}
	public static void main(String [] args) {
		launch(args);
	}

}
