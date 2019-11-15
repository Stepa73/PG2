package farma;

public class Pes extends AMazlicek {
    
    private double vaha;

    public Pes(String jmeno, int vek, double vaha, boolean stav) {
        super(jmeno, vek);
        this.vaha = vaha;
        ockovani(stav);
    }

    @Override
    public String toString() {
        return "Jsem pes " + super.getJmeno() + ", je mi " + super.getVek() + " let a vážím " + this.getVaha() + " kg";
    }
    
    @Override
    public void zvuk() {
        System.out.println("Haf, haf ...");
    }

    @Override
    public void pohyb() {
        System.out.println("Běhám rychle a rád.");
    }

    @Override
    public void krmeni() {
        System.out.println("Nejraději mám maso - cca " + (this.getVaha() / 5.0) + " kg.");
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
    
}