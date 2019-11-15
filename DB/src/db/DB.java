/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author stopk
 */
public class DB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String conneString = "jdbc:mysql://localhost/bajer?user=root&password=stera3000";
        System.out.println("Pripojovani k DB. . .");
        try{
            try (MySqlConection inst = MySqlConection.getInstance(conneString)) {
            //MySqlConection i2 = MySqlConection.getInstance();
            
            Connection c = inst.getConnection();
            System.out.println("Připojeno: ");
            
                System.out.println("Letiště");
                String sql = "SELECT jmeno, idZaci FROM intranet.intranet_zaci";
                try(Statement st = c.createStatement(); ResultSet vysledek = st.executeQuery(sql)){
                        while (vysledek.next()) {
                            System.out.printf("%s - %s\n", vysledek.getString(1), vysledek.getString("idZaci"));
                        }
               
                sql = "SELECT jmeno, idZaci FROM intranet.intranet_zaci WHERE jmeno LIKE ?";
                try(PreparedStatement ps = c.prepareStatement(sql)){
                    Scanner sc = new Scanner (System.in);
                    System.out.println("Zadej znaky počáteční shody: ");
                    String shoda = sc.nextLine();
                    shoda += "%";
                    ps.setString(1, shoda);
                    
                    try(ResultSet rs = ps.executeQuery()){
                            while(rs.next()){
                                System.out.printf("%s - %s\n", rs.getString("jmeno"), rs.getString("idZaci"));
                            }
                    }
                }}
            inst.close();}
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
