package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddMemberPageController {

    private Stage stage;
    private Scene scene;

    public void cancelMainPage(ActionEvent actionEvent) {
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

    public void addMember(ActionEvent actionEvent) {

    }
}
