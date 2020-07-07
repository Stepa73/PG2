
package obrazce;

/**
 * @author stopk
 */
public class Lib {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;

    public double kruhObvod() {
        double kobvod = a * (Math.PI) * 2;
        return kobvod;
    }

    public double kruhObsah() {
        double kobsah = (Math.PI) * a * a;
        return kobsah;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }
}