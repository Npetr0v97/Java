package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;

    @FXML
    public void initialize() {

        helloButton.setDisable(true);
        byeButton.setDisable(true);

    }

    @FXML
    public void onButtonClicked(ActionEvent event) {
        if (event.getSource().equals(helloButton)) {

            System.out.println("Hello, " + nameField.getText());

        } else if (event.getSource().equals(byeButton)){
            System.out.println("Bye, " + nameField.getText());

        }

        try {

            Thread.sleep(10000);
        } catch (InterruptedException e) {
            //we don't care about this here
        }

        if (ourCheckBox.isSelected()) {

            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }


        System.out.println("The following button was pressed: " + event.getSource());
    }

    @FXML
    public void handleKeyReleased() {

        String text=nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();

        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }

    @FXML
    public void handleChange() {

        System.out.println("The checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }
}
