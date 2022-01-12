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

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
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

    public ArrayList<Person> personArrayList = new ArrayList<>();

    AddMemberPageController addMemberPageController = new AddMemberPageController();

    /*
    public Controller(ArrayList<Person> personArrayList, AddMemberPageController addMemberPageController) {

        personArrayList = addMemberPageController.arrayList;

    }

     */

    @FXML
    public void selectitem() {
        TreeItem<String> item = (TreeItem<String>) treeview.getSelectionModel().getSelectedItem();

        System.out.println(item);
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


    public void update() throws IOException {
        try
        {
            FileInputStream fis = new FileInputStream("familyTree.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            personArrayList = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        //Verify list data
        for (Person person : personArrayList) {
            System.out.println("Update içi Person" + person.getName());
        }
    }

    @FXML
    public void initialize() throws IOException{
        update();
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
        TreeItem<String> rootItem = new TreeItem<>(personArrayList.get(0).getName());

        TreeItem<String> branchItem1 = new TreeItem<>("b1");
        TreeItem<String> branchItem2 = new TreeItem<>("b2");
        TreeItem<String> branchItem3 = new TreeItem<>("b3");

        TreeItem<String> leafItem1 = new TreeItem<>("l1");
        TreeItem<String> leafItem2 = new TreeItem<>("l2");
        TreeItem<String> leafItem3 = new TreeItem<>("l3");
        TreeItem<String> leafItem4 = new TreeItem<>("l4");
        TreeItem<String> leafItem5 = new TreeItem<>("l5");
        TreeItem<String> leafItem6 = new TreeItem<>("l6");

        branchItem1.getChildren().addAll(leafItem1,leafItem2);
        branchItem2.getChildren().addAll(leafItem3,leafItem4);
        branchItem3.getChildren().addAll(leafItem5,leafItem6);

        rootItem.getChildren().addAll(branchItem1,branchItem2,branchItem3);

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
