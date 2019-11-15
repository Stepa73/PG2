/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setter.getter;

/**
 *
 * @author stopk
 */
public class Bejvalka {
    private String jmenoHolky;
       
    public void setJmeno(String jmeno){
            jmenoHolky = jmeno;
    }
public String getJmeno(){
return jmenoHolky;
}
public void vyrok(){
    System.out.printf("tvoje první holka se jmenovala: %s",  getJmeno());
}
}
