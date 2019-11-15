package farma;

public class Kocka extends AMazlicek{

    private double vaha;
    private String barva;

    public Kocka(String jmeno, int vek, double vaha, String barva, boolean stav) {
        super(jmeno, vek);
        this.vaha = vaha;
        this.barva = barva;
        ockovani(stav);
    }

    @Override
    public String toString() {
        return "Jsem kočka " + super.getJmeno() + ", je mi " + super.getVek() + " let, vážím " + this.getVaha() + " kg a moje barva je: " + this.getBarva();
    }
    
    @Override
    public void zvuk() {
        System.out.println("Mňau, mňau ...");
    }

    @Override
    public void pohyb() {
        System.out.println("Ráda skáču po pohovce ...");
    }

    @Override
    public void krmeni() {
        System.out.println("Ráda chytám myši - " + (Math.floor(this.getVaha() / 5.0)) + " za den.");
    }
    
    @Override
    protected void ockovani(boolean stav) {
        if (stav) {
            System.out.println("Jsem očkován.");
        } else {
            System.out.println("Pozor, nejsem očkován!");
        }
    }
    
    public double getVaha() {
        return vaha;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    public String getBarva() {
        return barva;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }
    

}
