import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo2_Hello_Profi {

   
    public static void main(String[] args) {
        // TODO code application logic here
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
            private static void createAndShowGUI() {
                JFrame frame = new JFrame("Hello world (swing)");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JLabel lable = new JLabel("Hello world", 0);
                frame.getContentPane().add(lable);
                
                frame.pack();
                frame.setVisible(true);
                
                 frame.setSize(400, 250);
                 frame.setTitle("Titulek");
                 frame.setLocationRelativeTo(null);
                 
     
     
        }
    }
    

