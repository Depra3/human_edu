package fxExam;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage pri) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("root2.fxml"));
		Parent root = loader.load();
		RootController controller = loader.getController();
		controller.setPrimaryStage(pri);
		
		Scene scene = new Scene(root);
		
		pri.setTitle("T - Chart");
		pri.setScene(scene);
		pri.setResizable(false);
		pri.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
