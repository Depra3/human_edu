package fx03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController016 implements Initializable {
	@FXML private Slider slider;
	@FXML private Label label;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				label.setFont(new Font(newValue.doubleValue()));
				System.out.println("oldValue : " + oldValue);
				System.out.println("newValue : " + newValue);
				System.out.println("-------------------------------------");
//				System.out.println("newValue.doubleValue() : " + newValue.doubleValue());
			}
		});
	}

}
