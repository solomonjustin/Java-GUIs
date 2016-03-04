package HOT;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HeadsOrTails extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Load FXML file
		Parent parent = FXMLLoader.load(getClass().getResource("HeadsOrTails.fxml"));
		
		//Build the scene graph
		Scene scene = new Scene(parent);
		
		//Display window using the scene graph
		primaryStage.setTitle("Choose Heads or Tails");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	

	public static void main(String[] args) {
		//Launch App
		launch(args);

	}

}
