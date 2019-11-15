//bude v knihovně metodě combobox změna textu 
package lib;


public class knihovna {
    public static double prevodNaC(double teplotaD){
        return (5*(teplotaD -32))/9;
    }

    public static double prevodNaF(double teplotaD){
        return (9*(teplotaD)/5)+32;
    }
}
