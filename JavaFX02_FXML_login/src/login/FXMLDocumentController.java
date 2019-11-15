/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author stopk
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private PasswordField heslo;
    @FXML
    private TextField jmeno;
    @FXML
    private Label spravne;
    
    @FXML
    private void mujButtonHendler(ActionEvent event) throws IOException {
        String jmen = jmeno.getText();
        String hesl = heslo.getText();
        spravne.setText("heslo: " + hesl+ " Jmeno: "+jmen);
       
        if(jmen.equals("Stepa") && hesl.equals("Stepa")) {
            spravne.setText("Správně");
             Parent root = FXMLLoader.load(getClass().getResource("/calc/FXMLCalculator.fxml"));
            Scene scena = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scena);
            stage.setTitle("Calculator");
            stage.show();
            
        }
        else{
                spravne.setText("Špatně");
                }
    }
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        //label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   
    
}
