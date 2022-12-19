package fx15;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class RootController028 implements Initializable {
	@FXML private Button btnLogin;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnLogin.setOnAction(e->handleBtnLogin(e));
	}
	
	public void  handleBtnLogin(ActionEvent event) {
		try {
			Parent login= FXMLLoader.load(getClass().getResource("login.fxml"));
			StackPane root = (StackPane) btnLogin.getScene().getRoot();
			root.getChildren().add(login);
			
			login.setTranslateX(350); // 시작점
			// 이동의 애니메이션의 시작점을 가로 350px 지점에서 시작함.
			// 350px는 화면의 가로크기를 의미함.

			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(login.translateXProperty(), 0); // 도착점
			// 0 : 이동하는 X좌표를 50px까지 이동함.
			KeyFrame keyFrame = new KeyFrame(Duration.millis(1000), keyValue); // 프레임 조절
			// Duration.millis(1000) : 1초 동안 이동하는 애니메이션 작동.
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
