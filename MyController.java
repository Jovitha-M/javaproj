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
    void onclick1(ActionEvent event) {
    	try {
    		Parent root1 = (Parent) FXMLLoader.load(getClass().getResource("todolist.fxml"));
    		Stage stage = new Stage();
    		stage.setTitle("To Do List");
    		stage.setScene(new Scene(root1));
    		stage.show();
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}

    }

    @FXML
    void onclick10(ActionEvent event) {

    }

    @FXML
    void onclick11(ActionEvent event) {

    }

    @FXML
    void onclick12(ActionEvent event) {

    }

    @FXML
    void onclick13(ActionEvent event) {

    }

    @FXML
    void onclick14(ActionEvent event) {

    }

    @FXML
    void onclick15(ActionEvent event) {

    }

    @FXML
    void onclick16(ActionEvent event) {

    }

    @FXML
    void onclick17(ActionEvent event) {

    }

    @FXML
    void onclick18(ActionEvent event) {

    }

    @FXML
    void onclick19(ActionEvent event) {

    }

    @FXML
    void onclick2(ActionEvent event) {

    }

    @FXML
    void onclick20(ActionEvent event) {

    }

    @FXML
    void onclick21(ActionEvent event) {

    }

    @FXML
    void onclick22(ActionEvent event) {

    }

    @FXML
    void onclick23(ActionEvent event) {

    }

    @FXML
    void onclick24(ActionEvent event) {

    }

    @FXML
    void onclick25(ActionEvent event) {

    }

    @FXML
    void onclick26(ActionEvent event) {

    }

    @FXML
    void onclick27(ActionEvent event) {

    }

    @FXML
    void onclick28(ActionEvent event) {

    }

    @FXML
    void onclick29(ActionEvent event) {

    }

    @FXML
    void onclick3(ActionEvent event) {

    }

    @FXML
    void onclick30(ActionEvent event) {

    }

    @FXML
    void onclick31(ActionEvent event) {

    }

    @FXML
    void onclick4(ActionEvent event) {

    }

    @FXML
    void onclick5(ActionEvent event) {

    }

    @FXML
    void onclick6(ActionEvent event) {

    }

    @FXML
    void onclick7(ActionEvent event) {

    }

    @FXML
    void onclick8(ActionEvent event) {

    }

    @FXML
    void onclick9(ActionEvent event) {

    }

}