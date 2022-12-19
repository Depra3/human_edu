package fx11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain024 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
//		Parent root = (Parent)FXMLLoader.load(getClass().getResource("root.fxml"));
		// 아래와 동일함.
		FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml"));
		Parent root = loader.load();
		// 메인 프로그램에 root.fxml의 레이아웃을 배치함.
		RootController024 controller = loader.getController();
		// RootController024에 root.fxml이란 레이아웃을 연결함.
		controller.setPrimaryStage(primaryStage);
		// controller (동작에 대해서 정의 하는 파일)도 Stage에 적용함.
		// ==> Sub 다이얼로그 메인 프로그램에 종속.
		
		Scene scene = new Scene(root);
	
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
