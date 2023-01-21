package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.ZoneId;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.sql.Date;
import java.sql.ResultSet;


public class to_do_controller {

    @FXML
    private Font x7;

    @FXML
    private Color x8;

    @FXML
    private TextField priority_task;

    @FXML
    private TextField name_task;

    @FXML
    private DatePicker datetaken;

    @FXML
    private CheckBox item2;

    @FXML
    private CheckBox item3;

    @FXML
    private CheckBox item4;

    @FXML
    private CheckBox item5;

    @FXML
    private CheckBox item6;
    
    @FXML
    private Button closeButton;
    
    public void initialize(){
        closeButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                ((Stage) closeButton.getScene().getWindow()).close();
            }
        });
    }
    @FXML
    void check2(ActionEvent event) {
    	try {
            // Establish a connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniprojdb", "root", "Jovitha2003");

            // Prepare a query to delete the selected task
            PreparedStatement stmt = con.prepareStatement("DELETE FROM todolist WHERE Name_of_task = ?");
            stmt.setString(1, item2.getText());

            // Execute the query
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void check3(ActionEvent event) {
    	try {
            // Establish a connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniprojdb", "root", "Jovitha2003");

            // Prepare a query to delete the selected task
            PreparedStatement stmt = con.prepareStatement("DELETE FROM todolist WHERE Name_of_task = ?");
            stmt.setString(1, item3.getText());

            // Execute the query
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void check4(ActionEvent event) {
    	try {
            // Establish a connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniprojdb", "root", "Jovitha2003");

            // Prepare a query to delete the selected task
            PreparedStatement stmt = con.prepareStatement("DELETE FROM todolist WHERE Name_of_task = ?");
            stmt.setString(1, item4.getText());

            // Execute the query
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    	

    }

    @FXML
    void check5(ActionEvent event) {
    	try {
            // Establish a connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniprojdb", "root", "Jovitha2003");

            // Prepare a query to delete the selected task
            PreparedStatement stmt = con.prepareStatement("DELETE FROM todolist WHERE Name_of_task = ?");
            stmt.setString(1, item5.getText());

            // Execute the query
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void check6(ActionEvent event) {
    	try {
            // Establish a connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniprojdb", "root", "Jovitha2003");

            // Prepare a query to delete the selected task
            PreparedStatement stmt = con.prepareStatement("DELETE FROM todolist WHERE Name_of_task = ?");
            stmt.setString(1, item6.getText());

            // Execute the query
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void checkdate(ActionEvent event) {
        try {
            // Establish a connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniprojdb", "root", "Jovitha2003");

            // Prepare a query to retrieve the tasks for the selected date
            java.util.Date date = java.util.Date.from(datetaken.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            PreparedStatement stmt = con.prepareStatement("SELECT Name_of_task FROM todolist WHERE date_of_task = ?");
            stmt.setDate(1, sqlDate);

            // Execute the query and retrieve the result set
            ResultSet rs = stmt.executeQuery();

            // Iterate through the result set and update the checkbox items
            int i = 2;
            while (rs.next()) {
                String task = rs.getString("Name_of_task");
                CheckBox checkbox = (CheckBox) this.getClass().getDeclaredField("item" + i).get(this);
                checkbox.setText(task);
                checkbox.setVisible(true);
                i++;
                
            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    @FXML
    void enterdate(ActionEvent event) {
    	try
		{
			//To load driver class
    		Class.forName("com.mysql.cj.jdbc.Driver");
			/*Establishing connection with mysql*/
			final Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniprojdb", "root", "Jovitha2003");
			String sql ="insert into todolist(Name_of_task,priority,date_of_task) values (?,?,?)";
			// preparing sql statement
			PreparedStatement p=con.prepareStatement(sql);
			p.setString(1,name_task.getText());
			p.setString(2,priority_task.getText());
			java.util.Date date = java.util.Date.from(datetaken.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			p.setDate(3, sqlDate);
			//To update values in database ie to execute
			p.executeUpdate();
		}
		catch(Exception s)
		{
			s.printStackTrace();
		}
    	
    }
}