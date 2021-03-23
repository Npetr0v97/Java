package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button importIssues;
    @FXML
    private Button configureFields;
    @FXML
    private Label importConfigureActions;


    @FXML
    public void initializeIssueImport(Event event) {

        System.out.println("Begin issue import");
        System.out.println(event.getSource());

        importConfigureActions.setText("Issues successfully imported!");
    }

    @FXML
    public void initializeFieldConfiguration(Event event) {

        System.out.println("Begin fields configuration");
        System.out.println(event.getSource());

        importConfigureActions.setText("Fields successfully configured!");
    }

}
