package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;



public class Controller {

    private Stage stage;
    private Scene scene;
    private Person person;
    private String fullname;
    private String age;

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
    private ScrollPane scrollPane;
    @FXML
    private TreeView treeview;

    public static ArrayList<Person> personArrayList = new ArrayList<>();

    AddMemberPageController addMemberPageController = new AddMemberPageController();

    /*
    public Controller(ArrayList<Person> personArrayList, AddMemberPageController addMemberPageController) {

        personArrayList = addMemberPageController.arrayList;

    }

     */


    @FXML
    public void selectitem() {



            TreeItem<String> item = (TreeItem<String>) treeview.getSelectionModel().getSelectedItem();
            if (item!=null){
                if (!item.getValue().equals(personArrayList.get(1).name) && !item.getValue().equals(personArrayList.get(1).mother.name + " " + personArrayList.get(1).father.name)){
                    int cnt=0;
                    for (Person sibling : personArrayList.get(1).siblings) {
                        if (sibling.name.equals(item.getValue())){
                            break;
                        }
                        cnt++;
                    }
                    changeScreen(personArrayList.get(1).siblings.get(cnt).name,personArrayList.get(1).siblings.get(cnt).age,personArrayList.get(1).siblings.get(cnt).gender);
                    System.out.println(item);
                } else {
                    changeScreen(personArrayList.get(1).name,personArrayList.get(1).age,personArrayList.get(1).gender);
                }
            } else {
                changeScreen(personArrayList.get(1).name,personArrayList.get(1).age,personArrayList.get(1).gender);
            }


        }



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

    public String changeScreen(String name, String age, Gender gender){
        System.out.println("changeScreen methodu çalıştı");
        nameLabel.setText(name);
        ageLabel.setText(age);
        genderLabel.setText(gender.toString());
        fullname = name;
        return fullname;
    }

    public static void update() {
        try
        {
            File file = new File("familyTree.txt");
            boolean fileCheck = file.length()!=0;
            System.out.println(fileCheck);

            if (fileCheck){
                FileInputStream fis = new FileInputStream("familyTree.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                System.out.println("Update arraylist first:" + personArrayList.size());
                System.out.println("File"+file.length());
                personArrayList = (ArrayList<Person>) ois.readObject();

                System.out.println("Update arraylist:" + personArrayList.size());
                ois.close();
                fis.close();
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
            return;
        }


        //Verify list data
        for (Person person : personArrayList) {
            System.out.println("Update içi Person" + person.name);
        }
    }

    @FXML
    public void initialize() {

        update();
        TreeItem<String> branchItem1;

        /*
        nameLabel.setText("initialized.");
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(2),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                // Call update method for every 2 sec.
                                update();
                            }
                        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

*/
        if (personArrayList.isEmpty()) {

            personArrayList.add(new Person("","",Gender.Male,new Person("test","22",Gender.Female),new Person("test","test",Gender.Male)));
        }

        System.out.println("arraylist size :" +personArrayList.size());
        TreeItem<String> rootItem;
        if (personArrayList.size() == 1){
            rootItem = new TreeItem<>(personArrayList.get(0).name);


        } else {
            rootItem = new TreeItem<>(personArrayList.get(1).name);
            branchItem1 = new TreeItem<>(personArrayList.get(1).mother.name +" "+ personArrayList.get(1).father.name);
            TreeItem<String> leafItem = new TreeItem<>(personArrayList.get(1).name);


                    for (Person siblings:personArrayList.get(1).siblings) {
                        branchItem1.getChildren().addAll(new TreeItem<String>(siblings.name));
                    }



            for (Person child : personArrayList.get(1).child) {
                leafItem.getChildren().addAll(new TreeItem<String>(child.name));
            }
            branchItem1.getChildren().addAll(leafItem);
            rootItem.getChildren().addAll(branchItem1);
        }

        treeview.setRoot(rootItem);







        //Controller controller = new Controller(personArrayList,addMemberPageController);


       // System.out.println("person: " + controller.personArrayList.get(0));
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

    public void addRelation(ActionEvent actionEvent) {
    }


}
