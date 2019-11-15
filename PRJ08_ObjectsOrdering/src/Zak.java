public class Zak implements Comparable<Zak>{

    private String jmeno;
     private String trida;
      private double prumer;

    public Zak(String jmeno, String trida, double prumer) {
        this.jmeno = jmeno;
        this.trida = trida;
        this.prumer = prumer;
    }
    //řazení dle jména \/\/\/\/\/ tohle je porovnávání řetězců
//    @Override
//    public int compareTo(Zak zak) {
//        return this.jmeno.compareTo(zak.jmeno);
//    }
//řazení dle průměrů \/\/\/\/\/ tohle je porovnávání řetězců
   @Override
    public int compareTo(Zak zak) {
       if (this.prumer > zak.prumer) {
           return 1;
       } else if(this.prumer == zak.prumer){
           return 0;
       }else{
           return -1;
       }
    }
    
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getTrida() {
        return trida;
    }

    public void setTrida(String trida) {
        this.trida = trida;
    }

    public double getPrumer() {
        return prumer;
    }

    public void setPrumer(double prumer) {
        this.prumer = prumer;
    }

   

    @Override
    public String toString() {
        return "Žák{" + "jméno= " + jmeno + ", třida= " + trida + ", průměr=" + prumer + '}';
    }

    

   

    
    
      
}
