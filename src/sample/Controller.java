package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;


public class Controller {

    private Stage stage;
    private Scene scene;
    private Person person;

    @FXML
    private VBox vBox;

    @FXML
    private Label nameLabel;

    @FXML
    private Label surnameLabel;

    @FXML
    private Label ageLabel;

    @FXML
    private Label genderLabel;

    @FXML
    private Label birthDateLabel;

    @FXML
    private Label aliveLabel;

    @FXML
    private Label deathDateLabel;

    @FXML
    private Button updateMemberButton;

    @FXML
    private Button deleteMemberButton;

    @FXML
    private Button addMemberButton1;

    @FXML
    private Label personLabel;

    @FXML
    private Button addRelativeButton;

    @FXML
    private Slider zoomScrool;

    @FXML
    private TextField searchBox;

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

    public void changeScreen(String name, String surName, String age, Boolean gender, LocalDate birthDate, Boolean isAlive){
        System.out.println("changeScreen methodu çalıştı");
        nameLabel.setText(name);
        surnameLabel.setText(surName);
        ageLabel.setText(age);
        genderLabel.setText(gender.toString());
        birthDateLabel.setText(birthDate.toString());
        aliveLabel.setText(isAlive.toString());
    }

    @FXML
    public void initialize(){


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

    public void updateMember(ActionEvent actionEvent) {

    }

    public void deleteMember(ActionEvent actionEvent) {

    }

    public void addRelative(ActionEvent actionEvent) {
    }
}
