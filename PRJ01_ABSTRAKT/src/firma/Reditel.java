package firma;


public class  Reditel extends AZamestnanec{
    
    private AZamestnanec[] delnici;

    public Reditel(String jmeno, int vek, AZamestnanec[] delnici) {
        super(jmeno, vek);
        this.delnici = delnici;
    }

    
    @Override
    public void cinnost() {
        System.out.println("Ja jsem tady ředitel a řídím tyto dělníky: ");
        for (int i = 0; i < delnici.length; i++) {
            System.out.println(delnici[i].getJmeno());
  
        }
    }

    public AZamestnanec[] getDelnici() {
        return delnici;
    }

    public void setDelnici(AZamestnanec[] delnici) {
        this.delnici = delnici;
    }
    
    
    
    
}
