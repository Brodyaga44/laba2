module com.example.imagetest {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.imagetest to javafx.fxml;
    exports com.example.imagetest;
}