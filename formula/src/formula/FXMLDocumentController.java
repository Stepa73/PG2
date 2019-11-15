/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import static java.util.Collections.list;
import java.util.Date;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author stopk
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField cislo;
    @FXML
    private TextField hel;
    @FXML
    private TextField jmeKon;
    @FXML
    private TextField jmeMed;
    @FXML
    private TextField katZpr;
    @FXML
    private TextField popis;
    @FXML
    private TextField obePopis;
    @FXML
    private TextField preZem;
    @FXML
    private TextField poz;
    @FXML
    private Label datum;
    @FXML
    private ComboBox<String> vyber;
    
    ObservableList<String > list = FXCollections.observableArrayList("Zákazník","SPEA Olomouc","PTC Praha");
   
    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy - MM - dd HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        
    
    @FXML
    private void send(ActionEvent event) {
       String cislo1 = cislo.getText();
       String hel1 = hel.getText();
       String jmeKon1 = jmeKon.getText();
       String jmeMed1 = jmeMed.getText();
       String katZpr1 = katZpr.getText();
       String popis1 = popis.getText();
       String obePopis1 = obePopis.getText();
       String preZem1 = preZem.getText();
       String poz1 = poz.getText();
       
        
        
        
        FileWriter zapis;
        try{
            zapis = new FileWriter("Zapis.csv", true);
            //- - - hlavièka 
            zapis.append("Cislo"); zapis.append(";");
            zapis.append("Datum a Èas"); zapis.append(";");
            zapis.append("# helpdesku"); zapis.append(";"); 
            zapis.append("Jméno a kontaktní údaje zákazníka"); zapis.append(";");
            zapis.append("Jméno / Medoro"); zapis.append(";");
            zapis.append("Kategorie zpracování"); zapis.append(";");
            zapis.append("Popis servisního zásahu"); zapis.append(";");
            zapis.append("Obecný popis technických a organizaènì bezpeènostních opatøení"); zapis.append(";");
            zapis.append("Pøedání tøetí zemì / mezinárodní organizace"); zapis.append(";");
            zapis.append("Poznámka"); zapis.append("\n");
            // - - - data
            zapis.append(cislo1); zapis.append(";");
            zapis.append(" "); zapis.append(";"); // tady bude datum :D snad
            zapis.append(hel1); zapis.append(";");
            zapis.append(jmeKon1); zapis.append(";"); 
            zapis.append(jmeMed1); zapis.append(";");
            zapis.append(katZpr1); zapis.append(";");
            zapis.append(popis1); zapis.append(";");
            zapis.append(obePopis1); zapis.append(";");
            zapis.append(preZem1); zapis.append(";");
            zapis.append(poz1); zapis.append(";");
            //zapis.append(); zapis.append("\n");

            
            zapis.close();
            
            System.out.println("Zapis OK...");
        }catch(IOException ex){
            System.out.println("Chynbý zapis. . .");
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        vyber.setItems(list);
        
    }    
    
}
