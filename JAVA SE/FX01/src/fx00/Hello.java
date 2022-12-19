package fx00;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hello extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creating the java button
        Button btn = new Button();
        // Setting text to button
        btn.setText("Hello World");
        //registering a handler for button
        btn.setOnAction((ActionEvent event) -> {
            // printing Hello World! to the console
            System.out.println("Hello World!");
        });
        // Initializing the StackPane class
        StackPane root = new StackPane();
        // Adding all the nodes to the FlowPane
        root.getChildren().add(btn);
        //Creating a scene object
        Scene scene = new Scene(root, 300, 250);
        //Adding the title to the window (primaryStage)
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        // show the window(primaryStage)
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
