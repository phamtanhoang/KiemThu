package com.mycompany.buoi1;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a=100;
        if(a>0)
          
        App.setRoot("secondary");
    }
}
