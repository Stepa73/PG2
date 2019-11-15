
import javax.swing.JFrame;

import wokno.wokno;

public class Barvi {

    public static void main(String[] args) {
        wokno wokno = new wokno();
        wokno.setTitle("Blikač");
        wokno.setLocationRelativeTo(null);
        wokno.setVisible(true);
        wokno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}