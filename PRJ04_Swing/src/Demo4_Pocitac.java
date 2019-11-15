
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Demo4_Pocitac extends JFrame implements ActionListener{
        
       int i = 0;
       
       private JButton but;
       private JLabel lab;
       private JPanel panel;
       
    public Demo4_Pocitac(){
           mojeGUI();
    }   
       
       public static void main(String[] args) {
        // TODO code application logic here
       new Demo4_Pocitac();
    }

    private void mojeGUI() {
           //.. dodatečné ....
        this.setTitle("První akce");
        
        
        //zobrazí veprostřed
        this.setLocationRelativeTo(null);
        
        this.setSize(800, 100);
        
        but = new JButton("Stiskni");
        
        but.addActionListener((ActionListener) this);
        
        lab = new JLabel("Ahoj, až stiskneěš talčítko začne se počítat kolikrát si ho stiskl",0);
        
        
        panel = new JPanel(); //je automaticky nstaven "float leiout" plavoucí leiout
        panel.add(but);
        panel.add(lab);
        
        this.add(panel);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // = 3
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         
        i++;
        String cislo = Integer.toString(i);
        
       
        lab.setText("Stiskl jsi: "+cislo+"krát");
    }
    
}
