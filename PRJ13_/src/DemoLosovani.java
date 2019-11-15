
import java.util.Scanner;
import loterie.Losovani;


public class DemoLosovani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Losovani los = new Losovani();
        int count = 1;
        
        System.out.println("Spusťte losovaání šťasných deset - Enter");
        String str = sc.nextLine();
        
        do{
            System.out.println(count+ ". losovani: ");
            Thread.sleep(3000);
            System.out.println("(" + los.losuj()+")\t...");
            System.out.println(los);
            count++;
        }while(los.getCisla.size() < los.getPocetTahu());
        
    }
    
}
