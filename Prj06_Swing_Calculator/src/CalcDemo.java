import javax.swing.JFrame;
import wokna.CalcFrame;

public class CalcDemo {

    public static void main(String[] args) {
        CalcFrame wokno = new CalcFrame();
        wokno.setTitle("Calculator");
        wokno.setLocationRelativeTo(null);
        wokno.setVisible(true);
        wokno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
