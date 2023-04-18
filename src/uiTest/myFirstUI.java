package uiTest;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class myFirstUI extends Application {


    public void start(Stage primaryStage) {
        Button btOK = new Button("OK");
        btOK.setStyle("-fx-background-color:#ff0f00");
        Scene scene = new Scene(btOK,200,50);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String args[]) {
        Application.launch(args);
    }
}
