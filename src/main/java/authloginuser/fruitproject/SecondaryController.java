package authloginuser.fruitproject;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;

public class SecondaryController 
{
    @FXML
    private ComboBox<String> ddlChoice;
    @FXML
    private Label lblHowToEat;
    @FXML
    private TextField txtFruitAmount;
    @FXML
    private Label lblFruitAmount;
    @FXML
    private Button secondaryButton;
   
    private ArrayList<FruitInfo> fs = new ArrayList<>();   
    private ArrayList<FruitInfo> orders = new ArrayList<>();
    @FXML
    private ImageView imgDisplay;
    @FXML
    private Button btnAddToCart;
    @FXML
    private Label lblReceipt;
    @FXML
    private Label lblDisplayReceipt;
    @FXML
    private Label lblDisplayReciept2;
    @FXML
    private Button btnRemoveFromCArt;
    
    //this sets the combobox drop down with the different fruits
     public void initialize(){
        ddlChoice.getItems().removeAll(ddlChoice.getItems());
        ddlChoice.setPromptText("Please select which fruit(s) you would like");
        ddlChoice.setEditable(true);
    //arraylist holds all fruit options
    ObservableList<String> options = 
    FXCollections.observableArrayList(
        "Apple",
        "Orange",
        "Banana",
        "Dragonfruit",
        "Grapes",
        "Watermelon", 
        "Pomergranate"
    );
    ddlChoice.getItems().addAll(options);
    ddlChoice.setOnAction(this::ddlChangeChoice2);
        ddlChoice.setStyle("-fx-font: 20px \"Serif\"");
    }
     
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    //creating all fruit objects and adding each one to arraylist fs, allows user to selecct the dif fruits they want, go through the array
    @FXML 
    private void ddlChangeChoice2(ActionEvent event) {
         FruitInfo a = new Apple();
         FruitInfo o  = new Orange();
         FruitInfo b = new Banana();
         FruitInfo d = new Dragonfruit();
         FruitInfo g = new Grape();
         FruitInfo w  = new Watermelon();
         FruitInfo p = new Pomergranate();
         fs.add(a);
         fs.add(o);
         fs.add(b);
         fs.add(d);
         fs.add(g);
         fs.add(w);
         fs.add(p);
    }
    //method the updates what is display on the gui based on what fruits the user selects
    @FXML
    private void txtUpdateQuantity(KeyEvent event) {
    if(ddlChoice.getValue().contains("Apple"))  //if apple is choosen
        {   
            lblHowToEat.setText(fs.get(0).prepAndeat()); // gets element at 0 from array list which would be an apple object and calls the abstract prepandeat method and displays info from method and updates the label
            String imagePath = "file:src/main/resources/authloginuser/fruitproject/apple.gif";
            Image img = new Image(imagePath); //updating the image displayed based on what fruit they choose
            imgDisplay.setImage( img);
            
        }  
        else if(ddlChoice.getValue().contains("Orange"))
        {   lblHowToEat.setText(fs.get(1).prepAndeat()); 
            String imagePath = "file:src/main/resources/authloginuser/fruitproject/orange.gif";
            Image img = new Image(imagePath);
            imgDisplay.setImage( img);
        }
        else if(ddlChoice.getValue().contains("Banana"))
        {     lblHowToEat.setText(fs.get(2).prepAndeat()); 
              String imagePath = "file:src/main/resources/authloginuser/fruitproject/banana.gif";
              Image img = new Image(imagePath);
              imgDisplay.setImage( img);
        }
        else if(ddlChoice.getValue().contains("Pomergranate"))
        {    lblHowToEat.setText(fs.get(6).prepAndeat()); 
             String imagePath = "file:src/main/resources/authloginuser/fruitproject/pom.gif";
             Image img = new Image(imagePath);
             imgDisplay.setImage( img);
        }
        else if(ddlChoice.getValue().contains("Grapes"))
        {     lblHowToEat.setText(fs.get(4).prepAndeat()); 
              String imagePath = "file:src/main/resources/authloginuser/fruitproject/grapes.gif";
              Image img = new Image(imagePath);
              imgDisplay.setImage( img);
        }
         else if(ddlChoice.getValue().contains("Watermelon"))
         {    lblHowToEat.setText(fs.get(5).prepAndeat()); 
              String imagePath = "file:src/main/resources/authloginuser/fruitproject/watermelon.gif";
              Image img = new Image(imagePath);
              imgDisplay.setImage( img);
         }
        else if(ddlChoice.getValue().contains("Dragonfruit"))   
        {
            lblHowToEat.setText(fs.get(3).prepAndeat());
            String imagePath = "file:src/main/resources/authloginuser/fruitproject/dragonfruit.gif";
            Image img = new Image(imagePath);
            imgDisplay.setImage( img);
        }
        else 
        {  
            lblHowToEat.setText(""); 
      
        
        }
        
    }
    
    //method when add to cart button is clicked will add what fruits they want and display on gui
    @FXML
    private void btnAddToCart_click(ActionEvent event) {
        if(ddlChoice.getValue().contains("Apple"))  
        {   
            FruitInfo a = new Apple();
            a.setFruitAmount(Integer.parseInt(txtFruitAmount.getText())); //intializes fruit object and uses the setters to set the fruit amount, name, and price
            a.setFruitName("Apple");
            a.setFruitPrice(0.99);
            orders.add(a); //add object to array list orders, this array list holds all the values for adding the fruits to the cart
           
           
         
        }  
        else if(ddlChoice.getValue().contains("Orange"))
        {   
           FruitInfo o = new Orange(); 
           o.setFruitAmount(Integer.parseInt(txtFruitAmount.getText()));
           o.setFruitName("Orange");
           o.setFruitPrice(0.99);
           orders.add(o);
            
          
           
        }
        else if(ddlChoice.getValue().contains("Banana"))
        {   
           FruitInfo b = new Banana(); 
           b.setFruitAmount(Integer.parseInt(txtFruitAmount.getText()));
           b.setFruitName("Banana");
           b.setFruitPrice(0.25);
           orders.add(b);
           
          
        }
        else if(ddlChoice.getValue().contains("Pomergranate"))
        {
           FruitInfo p = new Pomergranate(); 
           p.setFruitAmount(Integer.parseInt(txtFruitAmount.getText()));
           p.setFruitName("Pomergranate");
           p.setFruitPrice(2.99);
           orders.add(p);
            
        }
        else if(ddlChoice.getValue().contains("Grapes"))
        { 
           FruitInfo g = new Grape(); 
           g.setFruitAmount(Integer.parseInt(txtFruitAmount.getText()));
           g.setFruitName("Grapes");
           g.setFruitPrice(2.79);
           orders.add(g);

        }
         else if(ddlChoice.getValue().contains("Watermelon"))
         {  
           FruitInfo w = new Watermelon(); 
           w.setFruitAmount(Integer.parseInt(txtFruitAmount.getText()));
           w.setFruitName("Watermelon");
           w.setFruitPrice(4.19);
           orders.add(w);
         
         }
        else if(ddlChoice.getValue().contains("Dragonfruit"))   
        {
           FruitInfo d = new Dragonfruit(); 
           d.setFruitAmount(Integer.parseInt(txtFruitAmount.getText()));
           d.setFruitName("Dragonfruit");
           d.setFruitPrice(5);
           orders.add(d);
          
        }
        else 
        {  
            lblHowToEat.setText(""); 
            lblHowToEat.setText(""); 
        
        }
           
        
        
        String items = " "; 
        //for loop goes through all elements in the orders array and will hold the values and display each fruit the person added to cart with the amount and the price
        double total = 0.0;
        for (int i = 0; i < orders.size(); i++) 
        {
            items += orders.get(i).getFruitAmount()  + " " + orders.get(i).getFruitName() + "'s for " + orders.get(i).calcPrice(orders.get(i).getFruitAmount(), orders.get(i).getFruitPrice()) + ", ";
            total+= orders.get(i).calcPricedouble(orders.get(i).getFruitAmount(), orders.get(i).getFruitPrice());
        }
         String str = String.format("%.2f", total);
       
        lblDisplayReceipt.setText("You just purchased" + items);
        lblDisplayReciept2.setText("The total of all fruit(s) purchased is " + "$" + str);
    }

    //method to remove items from cart
    @FXML
    private void bntRemoveFromCart_Click(ActionEvent event) {
        if(ddlChoice.getValue().contains("Apple"))  
        {   
            FruitInfo a = new Apple();
            
            orders.remove(a);
           
           
         
        }  
        else if(ddlChoice.getValue().contains("Orange"))
        {   
           FruitInfo o = new Orange(); 
          

           orders.remove(o);
            
          
           
        }
        else if(ddlChoice.getValue().contains("Banana"))
        {   
           FruitInfo b = new Banana(); 
           orders.remove(b);
           
          
        }
        else if(ddlChoice.getValue().contains("Pomergranate"))
        {
           FruitInfo p = new Pomergranate(); 
           
           orders.remove(p);
            
        }
        else if(ddlChoice.getValue().contains("Grapes"))
        { 
           FruitInfo g = new Grape(); 

           orders.remove(g);

        }
         else if(ddlChoice.getValue().contains("Watermelon"))
         {  
           FruitInfo w = new Watermelon(); 

           orders.remove(w);
         
         }
        else if(ddlChoice.getValue().contains("Dragonfruit"))   
        {
           FruitInfo d = new Dragonfruit(); 
           
           orders.remove(d);
          
        }
        else 
        {  
            lblHowToEat.setText(""); 
            lblHowToEat.setText(""); 
        
        }
           
        
         String items = " "; 
        
        double total = 0.0;
        int last = orders.size(); 
        for (int i = 0; i < orders.size(); i++) 
        {
            
            //items += orders.remove(last);
            
            items += orders.remove(last-1).getFruitName() + orders.remove(last-1).getFruitAmount() + " " + "'s for " + orders.remove(last-1).calcPrice(orders.remove(last-1).getFruitAmount(), orders.remove(last-1).getFruitPrice()) + ", ";
            total+= orders.remove(last-1).calcPricedouble(orders.remove(last-1).getFruitAmount(), orders.remove(last-1).getFruitPrice());
        }
         String str = String.format("%.2f", total);
       
        lblDisplayReceipt.setText("You removed all items from cart " + items);
        lblDisplayReciept2.setText("The total of all fruit(s) purchased is " + "$" + str); 
     
    }
}