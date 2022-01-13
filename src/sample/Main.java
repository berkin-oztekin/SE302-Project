package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        primaryStage.setTitle("Family Tree");
        //primaryStage.getIcons().add(new Image("C:\\Users\\OMEN\\Desktop\\SE302-Project\\src\\sample\\tree.jpg"));
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
