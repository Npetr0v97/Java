package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.LinkedList;

public class Controller {


    @FXML
    private Label importConfigureActions;
    @FXML
    private Button cancelButton;
    @FXML
    private Button createButton;
    @FXML
    private ComboBox<String> projects;
    @FXML
    private ComboBox<String> issueTypes;
    @FXML
    private TextField summary;
    @FXML
    private DatePicker dueDate;
    @FXML
    private TextArea description;
    @FXML
    private ComboBox<String> assignees;


    private LinkedList<Task> tasks = new LinkedList<>();

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


    @FXML
    public void initialize() {

        createButton.setDisable(true);
    }

    @FXML
    public void checkAction() {

        System.out.println(dueDate.getValue().toString());
    }

    @FXML
    public void checkEmptyFields() {
        System.out.println("checkEmptyFields() executed");
        System.out.println(!assignees.getItems().isEmpty());
        if (!projects.getValue().isEmpty() && !issueTypes.getValue().isEmpty() && !summary.getText().isEmpty()
         && !description.getText().isEmpty() && !assignees.getValue().isEmpty()
                && !dueDate.getValue().toString().isEmpty()) {

            createButton.setDisable(false);
            //&& !dueDate.getValue().toString().isEmpty()
        } else {
            createButton.setDisable(true);
        }


    }

    // TODO: 23.3.2021 г. Make Create button inactive if fields are missing -> onKeyReleased for all fields
    

}
