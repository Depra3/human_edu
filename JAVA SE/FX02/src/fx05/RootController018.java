package fx05;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class RootController018 implements Initializable {
	@FXML private AnchorPane root;
	@FXML private Circle circle;
	@FXML private Rectangle rec;
	@FXML private Polygon tri;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		circle.centerXProperty().bind(Bindings.divide(root.widthProperty(), 2));
		// circle.centerXProperty() : 원의 X위치
		circle.centerYProperty().bind(Bindings.divide(root.heightProperty(), 2));
		// circle.centerYProperty() : 원의 Y위치
		System.out.println(root.widthProperty().toString());
		
		rec.translateXProperty().bind(Bindings.divide(root.widthProperty(), 2));
		rec.translateYProperty().bind(Bindings.divide(root.heightProperty(), 2));
		
		tri.translateXProperty().bind(Bindings.divide(root.widthProperty(), 2));
		tri.translateYProperty().bind(Bindings.divide(root.heightProperty(), 2));
		
		// 전부 0. 0 기준으로 중심이 잡힘.
	}

}
