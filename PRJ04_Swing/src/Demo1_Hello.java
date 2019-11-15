
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo1_Hello extends JFrame{
//GUI ručně s main metodou
    private JLabel lab;

    //téměř vše bude v konstruktoru 
    public Demo1_Hello() {
        
        lab = new JLabel("Ahoj kámo!, kamarádi", 0);//0 centruje
        this.add(lab);
        
        //nezbytné záležitosti, nutné 
        
        this.setSize(300, 100);
     
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        this.setVisible(true);
        
           //.. dodatečné ....
        this.setTitle("Wokno");
        
        
        //zobrazí veprostřed
        this.setLocationRelativeTo(null);
    }
    
    
    
    public static void main(String[] args) {
        // vytvoření instance pro zavolání konstruktoru
        Demo1_Hello demo1_Hello = new Demo1_Hello();
     
    }
    
}
