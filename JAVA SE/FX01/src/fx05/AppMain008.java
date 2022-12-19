package fx05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppMain008 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = (VBox)FXMLLoader.load(
			getClass().getResource("root2.fxml")
		);
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
