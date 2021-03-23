package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {


    @FXML
    private Label importConfigureActions;
    @FXML
    private Button cancelButton;


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

    @FXML
    public void createIssue(Event event) {

        System.out.println("Issue created");
        System.out.println(event.getSource());
    }

    @FXML
    public void cancel(Event event) {
        System.out.println("Closing button");
        System.out.println(event.getSource());
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    // TODO: 23.3.2021 г. Make Create button inactive if fields are missing
    

}
