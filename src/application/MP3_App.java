package application;

import java.util.HashMap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MP3_App extends Application{
	
	private HashMap<String, Pane> scenes;
	private Stage mainWindow;
	private Scene mainScene;
	
	
	public void init() {
		scenes = new HashMap<>();
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//init Views
			Pane root = new Pane();
			root.setStyle("-fx-background-color: lightgrey;");
			
			//root = new PlayView();
			//scenes.put("playerView", root);
			//root = new PlaylistView();
			
			//init Scene
			Scene scene = new Scene(root, 1200, 800);
			
			mainWindow = primaryStage;
			mainScene = scene;
			
			primaryStage.setScene(scene);
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
	public static void main(String [] args) {
		launch(args);
	}

}
