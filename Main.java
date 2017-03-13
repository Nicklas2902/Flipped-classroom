package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Button bt = new Button();
        bt.setText("Click me!!!");
        bt.setOnAction(event -> {
            System.out.println("This is fun!!");

        });
        StackPane sp = new StackPane();
        sp.getChildren().add(bt);

        Scene scene = new Scene(sp, 700, 700);

        primaryStage.setTitle("I hope i dont fuck this up");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
