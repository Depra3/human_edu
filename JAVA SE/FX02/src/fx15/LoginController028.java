package fx15;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class LoginController028 implements Initializable {
	@FXML private BorderPane login;
	@FXML private Button btnMain;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnMain.setOnAction(e->handleBtnMain(e));
	}
	
	public void handleBtnMain(ActionEvent event) {
		try {
			StackPane root = (StackPane) btnMain.getScene().getRoot();
			
			login.setTranslateX(0);
			// x가 0의 위치에서부터 시작함
			// 만약 100이라고 한다면 100px 위치에서 시작하는 의미.
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(login.translateXProperty(), 350);
			// 350 : 마지막을 350px 위치까지만 이동함.
			KeyFrame keyFrame = new KeyFrame(
	    		Duration.millis(1000), 
	    		new EventHandler<ActionEvent>() {
		        	@Override
		        	public void handle(ActionEvent event) {
		        		root.getChildren().remove(login);
		        	}// 2번째 인자 new EventHandler 는 애니메이션이 종료 되었을때 동작하는 것을 의미함.
		        	// root.getChildren().remove(login); 는 main페이지에서 login페이지를 지우는 것을 의미함.
		        }, 
		        keyValue
	        );
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
