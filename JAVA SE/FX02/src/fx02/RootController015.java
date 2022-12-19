package fx02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController015 implements Initializable {
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	// @는 어노테이션이라고 하는데. 메타데이터라고 하기도 함.
	// @FXML에 정의된 ID와 변수값을 일치화를 시켜줌.
	// FXML의 fx:id를 Button객체에 (동일 객체명에) 주입시킴.

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleBtn1Action(event);
			}
		});
		btn2.setOnAction(event->handleBtn2Action(event));
		btn3.setOnAction(event->handleBtn3Action(event));
	}
	
	public void handleBtn1Action(ActionEvent event) { 
		System.out.println("버튼1 클릭"); 
	}
	public void handleBtn2Action(ActionEvent event) { 
		System.out.println("버튼2 클릭"); 
	}
	public void handleBtn3Action(ActionEvent event) { 
		System.out.println("버튼3 클릭"); 
	}

}
