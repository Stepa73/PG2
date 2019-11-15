
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Demo3_Button extends JFrame implements ActionListener{

    private JButton but;
    private JLabel lab;
    private JPanel panel;

    public Demo3_Button() {
            mojeGUIInit();
    
    }
    
    
    
    
    public static void main(String[] args) {
     
      new Demo3_Button();
    }

    private void mojeGUIInit() {
        
           //.. dodatečné ....
        this.setTitle("První akce");
        
        
        //zobrazí veprostřed
        this.setLocationRelativeTo(null);
        
        this.setSize(300, 80);
        
        but = new JButton("Stiskni");
        
        but.addActionListener((ActionListener) this);
        
        lab = new JLabel("Ahoj");
        
        
        panel = new JPanel(); //je automaticky nstaven "float leiout" plavoucí leiout
        panel.add(but);
        panel.add(lab);
        
        this.add(panel);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // = 3
        
        
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        lab.setText("Ahoj a čau");
    }
}
