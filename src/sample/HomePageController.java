package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {

    private Stage stage;
    private Scene scene;

    public void createNewTree(ActionEvent actionEvent) throws IOException {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("mainpage.fxml"));
            stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public void exitProgram(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void getAboutUs(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("aboutUsPage.fxml"));
        Parent root = loader.load();

        //root = FXMLLoader.load(getClass().getResource("mainpage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void howToUse(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("helpPage.fxml"));
        Parent root = loader.load();

        //root = FXMLLoader.load(getClass().getResource("mainpage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void backPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        Parent root = loader.load();

        //root = FXMLLoader.load(getClass().getResource("mainpage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
