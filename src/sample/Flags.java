package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Flags extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane
        GridPane pane = new GridPane();
        // Add nodes to pane
        int count=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                pane.add(new ImageView(new Image("file:src/sample/image/flag"+count+".gif")), j, i);
                count++;
            }
        }
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 1000, 600);
        primaryStage.setTitle("Flags"); // Set title for stage
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
