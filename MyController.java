package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MyController {
    @FXML
    private void handleButtonClick(ActionEvent event) {
        try {
            Parent root = (Parent) FXMLLoader.load(getClass().getResource("todolist.fxml"));
            Stage stage = new Stage();
            stage.setTitle("To Do List");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
