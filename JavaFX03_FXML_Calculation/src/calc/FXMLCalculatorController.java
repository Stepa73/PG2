/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLCalculatorController implements Initializable {

   @FXML
    private TextField cislo1TextField;
    @FXML
    private TextField cislo2TextField;
    @FXML
    private ComboBox operaceComboBox;
    @FXML
    private Button vypocitejButton;
    @FXML
    private Label vysledekLabel;
    
     @FXML
    private void handleVypocitejButtonAction(ActionEvent event) {
        double cislo1 = Double.parseDouble(cislo1TextField.getText());
        double cislo2 = Double.parseDouble(cislo2TextField.getText());
        String operace = (String)operaceComboBox.getSelectionModel().getSelectedItem();
        double vysledek = 0;
        switch (operace)
        {
            case "+":
                vysledek = cislo1 + cislo2;
                break;
            case "-":
                vysledek = cislo1 - cislo2;
                break;
            case "*":
                vysledek = cislo1 * cislo2;
                break;
            case "/":
                if (cislo2 != 0)
                vysledek = cislo1 / cislo2;
                break;
        }
        vysledekLabel.setText(String.valueOf(vysledek));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         ObservableList<String> operace = FXCollections.observableArrayList("+", "-", "*", "/");
        operaceComboBox.setItems(operace);
        operaceComboBox.getSelectionModel().selectFirst();
        
    }    
    
}
