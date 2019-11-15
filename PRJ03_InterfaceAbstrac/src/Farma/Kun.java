package Farma;


public class Kun extends AMazlicek{
    
    private double vaha;
    private String barva;

    public Kun(String jmeno, int vek, double vaha, String barva, boolean stav) {
        super(jmeno, vek);
        this.barva = barva;
        this.vaha = vaha;
        ockovani(stav);
    }
    
    @Override
    public String toString() {
        return "Jsem kůň " + super.getJmeno() + ", je mi " + super.getVek() + " let, vážím " + this.getVaha() + " kg a moje barva je: " + this.getBarva();
    }
    
    @Override
    protected void ockovani(boolean stav) {
        if (stav) {
            System.out.println("Jsem očkováný Kůň.");
        } else {
            System.out.println("Pozor, nejsem očkovaný Kůň!");
        }
    }

    @Override
    public void zvuk() {
        System.out.println("Ihahaa ...");
    }

    @Override
    public void pohyb() {
        System.out.println("Rád skáču přes překážky ...");
    }

    @Override
    public void krmeni() {
        System.out.println("Za den spořádám alespoň - " + (this.getVaha() / 10.0) + " kg slámy!");
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(int vaha) {
        this.vaha = vaha;
    }

    public String getBarva() {
        return barva;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }
    
    

}
