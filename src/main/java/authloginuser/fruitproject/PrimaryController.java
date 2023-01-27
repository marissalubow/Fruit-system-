package authloginuser.fruitproject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.control.TableView; 
import javafx.scene.control.TableColumn; 
import javafx.scene.control.cell.PropertyValueFactory; 

public class PrimaryController {

    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassWord;
    @FXML
    private Button primaryButton;
    @FXML
    private Label lblErrorMsg;
    
    private ObservableList<LoginAuth> data; 

    public PrimaryController() throws SQLException
    {
        this.data = FXCollections.observableArrayList(); 
    }
   
    @FXML
    private void switchToSecondary() throws IOException, SQLException {
        
         this.data = FXCollections.observableArrayList(); 
         connect();
         boolean exist = false;
         for(int i = 0; i < this.data.size(); i++)
         {
             if(this.data.get(i).getUserName().equals(txtUserName.getText()) && this.data.get(i).getPassWord().equals(txtPassWord.getText() ))
             {
                 exist = true; 
             }
         }
         if(exist == true)
         {   lblErrorMsg.setText("Thank you");
             App.setRoot("secondary");
         }
         else 
         {
             lblErrorMsg.setText("Incorrect Username or Password"); 
         }

    }

    
    @FXML
    public void connect() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
         //tableView = new TableView();
            // db parameters (assumes movies.db is in the same directory)
        //try {
           
            //Class.forName("authloginuser.fruitproject.sqlite.jdbc.Driver");
            String url = "jdbc:sqlite:src/main/resources/authloginuser/fruitproject/movies.db";                   
//       
                                         //src/main/resources/com/mycompany/databaseexample/movies.db";
        // create a connection to the database
        conn = DriverManager.getConnection(url);
        System.out.println("Connection to SQLite has been established.");
        String sql = "SELECT * FROM LoginAuth WHERE UserName like '" + txtUserName.getText() + "' AND PassWord LIKE '"  + txtPassWord.getText() + "'";
        // Ensure we can query the actors table
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            LoginAuth login;
            login = new LoginAuth(rs.getInt("UserID"), rs.getString("UserName"), rs.getString("PassWord"));
            System.out.println(login.getUserID() + " - " + login.getUserName() + " - " + login.getPassWord());
            data.add(login);
        }
        rs.close();
        if (conn != null) {
            conn.close();
        }
//         } catch (ClassNotFoundException ex) {
//           Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
//          }
    }
    
}
