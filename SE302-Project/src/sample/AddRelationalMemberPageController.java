package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.Optional;
import java.util.jar.JarOutputStream;

public class AddRelationalMemberPageController {

    private Stage stage;
    private Scene scene;
    private Person person;
    private Gender gender;
    private String nameText;
    private String ageText;
    private boolean isGenderMale;
    private boolean isGenderFemale;

    public AddRelationalMemberPageController() {
        System.out.println("first");
    }

    public String getNameText() {
        return nameText;
    }

    public void setNameText(String nameText) {
        this.nameText = nameText;
    }

    public String getAgeText() {
        return ageText;
    }

    public void setAgeText(String ageText) {
        this.ageText = ageText;
    }

    public boolean isGenderMale() {
        return isGenderMale;
    }

    public void setGenderMale(boolean genderMale) {
        isGenderMale = genderMale;
    }

    public boolean isGenderFemale() {
        return isGenderFemale;
    }

    public void setGenderFemale(boolean genderFemale) {
        isGenderFemale = genderFemale;
    }

    @FXML
    private ComboBox<String> relation;

    @FXML
    private TextField name;

    @FXML
    private TextField age;

    @FXML
    private CheckBox genderMale;

    @FXML
    private CheckBox genderFemale;

    @FXML
    private Button cancelButton;

    @FXML
    private Button addButton;


    public void setRelation() {
        relation.getItems().add(0,"Mother");
        relation.getItems().add(1,"Father");
        relation.getItems().add(2,"Child");
        relation.getItems().add(3,"Partner");
        relation.getItems().add(4,"Sibling");
        relation.getItems().add(5,"Me");
    }


    @FXML
    public void initialize() {
        System.out.println("second");
        setRelation();

        genderMale.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                genderFemale.setDisable(t1);
                if(t1 == false) {
                    genderFemale.setDisable(false);
                }
            }
        });

        genderFemale.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                genderMale.setDisable(t1);
                if(t1 == false) {
                    genderMale.setDisable(false);
                }
            }
        });



    }

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
        Dialog dialog = new Dialog();
        dialog.setTitle("Alert!");
        ButtonType button = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().add(button);
        if (name.getText().equals("")){
            dialog.setContentText("Please enter your name and surname!");
            Optional<ButtonType> result = dialog.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                formatSystem();
            }
        }

        nameText = name.getText();
        ageText = age.getText();
        isGenderMale = genderMale.isSelected();
        isGenderFemale = genderFemale.isSelected();



        if (isGenderMale) {
            gender = Gender.Male;
        } else {
            gender = Gender.Female;
        }

        if (person == null) {
            person = new Person(nameText, ageText,gender );
            person.showInfo(person);
            System.out.println("person ifine girdik");
        } else {
            System.out.println("something went wrong!");
        }




        System.out.println("gender male : " + genderMale.isSelected());

        System.out.println("relation: " + relation.getValue());

    }

    private void formatSystem() {
        System.out.println("Please enter name and surname");
    }
}
