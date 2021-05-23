package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Tictactoe extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create two Image
        Image x=new Image("file:src/sample/image/x.gif");
        Image o=new Image("file:src/sample/image/o.gif");
        // Create a pane
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        // Add nodes to pane
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((i+j)%3==1)
                    pane.add(new ImageView(x), j, i);
                else if((i+j)%3==2)
                    pane.add(new ImageView(o), j, i);
            }
        }
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("TicTacToe"); // Set title for stage
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
