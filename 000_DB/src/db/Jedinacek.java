/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author stopk
 */
public class Jedinacek {
    private static Jedinacek instance;
    
    private  Jedinacek() {
    
    }
    
    public static Jedinacek getInstance(){
    if(instance == null)
        instance = new Jedinacek();
        
    return instance;
    }
}
