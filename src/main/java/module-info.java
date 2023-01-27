module authloginuser.fruitproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql; 
    opens authloginuser.fruitproject to javafx.fxml;
    exports authloginuser.fruitproject;
}
