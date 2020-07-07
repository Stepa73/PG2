package obrazce;

import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     *             -	Kruh
     *             -	Lichoběžník
     *             -	Obdélník
     *             -	Čtverec
     *             -	Kosodélník
     *             -	Kosočtverec
     *             -	Trojúhelník
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vvyber obrazec:\n" +
                "- \tKruh\n" +
                "-	lichoběžník\n" +
                "-	obdélník\n" +
                "-	čtverec\n" +
                "-	kosodélník\n" +
                "-	kosočtverec\n" +
                "-	trojúhelník\n (bez diakritiky)");
        String obrazec = sc.nextLine();

        Lib vypocet = new Lib();

        switch (obrazec) {
            case "kruh":
                System.out.println("Vybral jsi Kruh. Zadej obvod nebo obsah");
                String obne = sc.nextLine();
                if (obne != "obsah") {
                    System.out.println("Obsah: Zadej poloměr Kruhu: ");
                    vypocet.setA(sc.nextDouble());
                    double vysledek = vypocet.kruhObsah();
                    System.out.println("Obsah kruhu je: " + vysledek);
                } else {
                    System.out.println("Obvod: Zadej poloměr Kruhu: ");
                    vypocet.setA(sc.nextDouble());
                    double vysledek = vypocet.kruhObvod();
                    System.out.println("Obvod kruhu je: " + vysledek);
                }
                break;
            case "lichobeznik":
                System.out.println("Vybral jsi Lichoběžník");


                break;
            case "obdelnik":
                System.out.println("Vybral jsi Obdélník");


                break;
            case "ctverec":
                System.out.println("Vybral jsi Čtverec");


                break;
            case "kosodelnik":
                System.out.println("Vybral jsi Kosodélník");


                break;
            case "kosoctverec":
                System.out.println("Vybral jsi Kosočtverec");


                break;
            case "trojuhelnik":
                System.out.println("Vybral jsi Trojúhelník");


                break;
            default:
                System.err.println("Špatně zadaná hodnota ");
                break;
        }


    }

}
