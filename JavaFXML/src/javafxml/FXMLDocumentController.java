
package javafxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.lang.Math;
import javafx.scene.Cursor;
import javafx.scene.text.Font;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField display;
    @FXML
    private Label konzole;
    
    double vysledek = 0;
    double vsup1;
    double vsup2;
    int ps;
    int point;
    int ss = 0;
    String operace;
    String zpet ;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }    

    @FXML
    private void handleCislaAction(ActionEvent event) {
        String cislo = ((Button) event.getSource()).getText();
        String oldText = display.getText();
        String newText = oldText + cislo;
        
        display.setText(newText);
      
        
    }


    @FXML
    private void handleOperaceAction(ActionEvent event) {
        
        operace = ((Button) event.getSource()).getText();
        
     
        try{
        if( "C".equals(operace) ){
            
            display.setText("");
            konzole.setText(zpet);
            vsup1 = 0;
            vsup2 = 0;
            ps = 0;
            point =0;
        
        }
        
        else if(".".equals(operace) && point == 0){
            display.appendText(".");
            
            point = 1;
        }
        else if("+".equals(operace)){ 
            vsup1 = Double.parseDouble(display.getText());
            konzole.setText(display.getText()+" +");
            display.setText("");
            ps = 1;
            point = 0;
        }
         else if("-".equals(operace)){ 
            vsup1 = Double.parseDouble(display.getText());
            konzole.setText(display.getText()+" -");
            display.setText("");
            ps = 2;
            point = 0;
        }
         
         else if("/".equals(operace)){ 
            vsup1 = Double.parseDouble(display.getText());
            konzole.setText(display.getText()+" /");
            display.setText("");
            ps = 3;
            point = 0;
        }
         else if("*".equals(operace)){ 
            vsup1 = Double.parseDouble(display.getText());
            konzole.setText(display.getText()+" *");
            display.setText("");
            ps = 4;
            point = 0;
        }
           else if("back".equals(operace)){ 
            display.setText(zpet);
            ps = 0;
            point = 0;
        }
           else if("^".equals(operace)){ 
            vsup1 = Double.parseDouble(display.getText());
            konzole.setText(display.getText()+" ^");
            display.setText("");
            ps = 5;
            point = 0;
        }
           else if("sqrt".equals(operace)){ 
            vsup1 = Double.parseDouble(display.getText());
            konzole.setText(display.getText()+" sgrt stiskni =");
            display.setText("");
            ps = 6;
            point = 1;
            ss = 1;
        }
//----------------------------------------------------------------------
        else if("=".equals(operace) && ps > 0){ 
            
            if(ss == 0){
            
                vsup2 = Double.parseDouble(display.getText());
            
            }


          
            switch(ps){
                    
                case 1 : vysledek = vsup1 + vsup2;
                    konzole.setText(String.valueOf(vysledek));
                    display.setText("");
                    break  ;
               case 2 : vysledek = vsup1 - vsup2;
                    konzole.setText(String.valueOf(vysledek));
                    display.setText("");
                    break  ;
               case 3 : 
                   if(vsup2 == 0){
                       
                       konzole.setText("err Dìleni nulou");
                      
                      display.setText("");
                   }else{
                       
                   vysledek = vsup1 / vsup2;
                    konzole.setText(String.valueOf(vysledek));
                    display.setText("");}
                    break  ;
               case 4 : vysledek = vsup1 * vsup2;
                    konzole.setText(String.valueOf(vysledek));
                    display.setText("");
                    break  ;
               case 5 : vysledek = Math.pow(vsup1, vsup2);
                    konzole.setText(String.valueOf(vysledek));
                    display.setText("");
                    break  ;
                case 6 : vysledek = Math.sqrt(vsup1);
                    konzole.setText(String.valueOf(vysledek));
                    display.setText("");
                    break  ;
            
            }
            ss = 0;
            ps = 0 ;
            point = 0;
        }
         }catch(Exception e){
            konzole.setText("err: "+e.getMessage());
            display.setText("");
        }
    }

    @FXML
    private void handleDeleteAction(ActionEvent event) {
        String test = display.getText();
        String test2 = test.substring(0,test.length()-1);
        display.setText(test2);
    }

    @FXML
    private void handleRovnaSeAction(ActionEvent event) {
    }


    
}
