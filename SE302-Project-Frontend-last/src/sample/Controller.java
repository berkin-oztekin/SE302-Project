package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Controller {

    private Stage stage;
    private Scene scene;

    public void addMember(ActionEvent actionEvent) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("AddMemberPage.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
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

    public void newTree(ActionEvent actionEvent2) {
        // menu item olan new a basınca homepage e geri dönecek.
        /*
        try{
            Parent root2 = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            stage2 = (Stage)((Node)actionEvent2.getSource()).getScene().getWindow();
            scene2 = new Scene(root2);
            stage2.setScene(scene2);
            stage2.show();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }

         */
    }
}
