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
    @FXML
    private CheckBox createAnother;


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
        String project = projects.getValue();
        String issueType=issueTypes.getValue();
        String assignee = assignees.getValue();
        String taskDueDate = dueDate.getValue().toString();
        String taskSummary = summary.getText();
        String taskDescription = description.getText();


        Task task = new Task(assignee, project, issueType, taskSummary, taskDescription,taskDueDate);
        tasks.add(task);

        System.out.println(task);

        summary.clear();
        description.clear();
        dueDate.setValue(null);
        assignees.setValue(null);


        if (!createAnother.isSelected()) {
            projects.setValue(null);
            issueTypes.setValue(null);
        }



    }

    @FXML
    public void cancel(Event event) {

        for (Task task : tasks) {

            System.out.println("Task: "+ task.getIssueKey() +"\nSummary: " + task.getSummary() +
                    "\nDescription: " + task.getDescription() + "\nAssignee: " + task.getAssignee() +
                    "\nDue date: " + task.getDueDate());
            System.out.println("===================================");
        }

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
        if (projects.getValue() != null && issueTypes.getValue()!=null && assignees.getValue()!=null && dueDate.getValue()!=null
         && !summary.getText().isEmpty() && !description.getText().isEmpty()) {

                createButton.setDisable(false);

            } else {


                createButton.setDisable(true);


            }


    }




    

}
