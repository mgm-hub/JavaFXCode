package MainController;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;

public class Controller
    implements Initializable {

    @FXML // fx:id
    private Button myTopButton;
    private Button myBottomButton;
    private Label myLabel;
    @FXML
    private Parent MainView;


    @Override //init complete
    public void initialize(URL fxmlFileLocation, ResourceBundle resources){
            //assert myTopButton != null : "fx:id=\"TopButton\" Not injected";
            //assert myBottomButton != null : "fx:id=\"BottomButton\" Not injected";
    }



    @FXML
    private void topButtonAction(ActionEvent event)
    {
        System.out.println("topButtonPress : " +MainView.toString());
        //System.out.println(child.getParent().lookup("#lebelInParent"));
        // init
    }

    @FXML
    private void bottomButtonAction(ActionEvent event)
    {
        System.out.println("bottomButtonPress : "+MainView.toString());
    }

    @FXML
    private void textFieldDragAction(Event event)
    {
        Dragboard myDragBoard = MainView.startDragAndDrop(TransferMode.ANY);


        System.out.println("\nTextFieldDrag");
        //System.out.println("\nDrag board : "+myDragBoard.toString());



    }



}
