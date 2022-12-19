package fx10;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable {

	@FXML
	private ImageView du1;
	@FXML
	private ImageView du2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		du1.setOnKeyPressed(KeyEvent -> handleImage(KeyEvent));
		du2.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
//				System.out.println(event.getCode());
				handleImage(event);
			}
		});
	}

	public void handleImage(KeyEvent event) {
		KeyCode key = ((KeyEvent) event).getCode();
		
		if (key.equals(key.UP) && key.equals(key.LEFT)) {
			du2.setTranslateY(du2.getTranslateY() - 20);
			du2.setTranslateX(du2.getTranslateX() - 20);
		} else if (key.equals(key.UP) && key.equals(key.RIGHT)) {
			du2.setTranslateY(du2.getTranslateY() - 20);
			du2.setTranslateX(du2.getTranslateX() + 20);
		} else if (key.equals(key.DOWN) && key.equals(key.LEFT)) {
			du2.setTranslateY(du2.getTranslateY() + 20);
			du2.setTranslateX(du2.getTranslateX() - 20);
		} else if (key.equals(key.DOWN) && key.equals(key.RIGHT)) {
			du2.setTranslateY(du2.getTranslateY() + 20);
			du2.setTranslateX(du2.getTranslateX() + 20);
		} else if (key.equals(key.UP)) {
			System.out.println(key);
			du2.setTranslateY(du2.getTranslateY() - 20);
			System.out.println("2P : " + du2.getTranslateX() + ", " + du2.getTranslateY());
		} else if (key.equals(key.DOWN)) {
			System.out.println(key);
			du2.setTranslateY(du2.getTranslateY() + 20);
			System.out.println("2P : " + du2.getTranslateX() + ", " + du2.getTranslateY());
		} else if (key.equals(key.LEFT)) {
			System.out.println(key);
			du2.setTranslateX(du2.getTranslateX() - 20);
			System.out.println("2P : " + du2.getTranslateX() + ", " + du2.getTranslateY());
		} else if (key.equals(key.RIGHT)) {
			System.out.println(key);
			du2.setTranslateX(du2.getTranslateX() + 20);
			System.out.println("2P : " + du2.getTranslateX() + ", " + du2.getTranslateY());
		} else if (key.equals(key.SPACE)) {
			System.out.println(key);
			du1.setTranslateX(0);
			du1.setTranslateY(0);
			du2.setTranslateX(0);
			du2.setTranslateY(0);
			System.out.println("1P : " + du1.getTranslateX() + ", " + du1.getTranslateY());
			System.out.println("2P : " + du2.getTranslateX() + ", " + du2.getTranslateY());
		}
		switch (key.getCode()) {
		case 'W':
			System.out.println(key);
			du1.setTranslateY(du1.getTranslateY() - 20);
			System.out.println("1P : " + du1.getTranslateX() + ", " + du1.getTranslateY());
			break;
		case 'S':
			System.out.println(key);
			du1.setTranslateY(du1.getTranslateY() + 20);
			System.out.println("1P : " + du1.getTranslateX() + ", " + du1.getTranslateY());
			break;
		case 'A':
			System.out.println(key);
			du1.setTranslateX(du1.getTranslateX() - 20);
			System.out.println("1P : " + du1.getTranslateX() + ", " + du1.getTranslateY());
			break;
		case 'D':
			System.out.println(key);
			du1.setTranslateX(du1.getTranslateX() + 20);
			System.out.println("1P : " + du1.getTranslateX() + ", " + du1.getTranslateY());
			break;
		}
	}
}
