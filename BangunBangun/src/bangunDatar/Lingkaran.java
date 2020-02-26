
package bangunDatar;


public class Lingkaran {
    private double jari2;
    public double luas,keliling;
    double phi=3.14;

    public Lingkaran(double jari2) {
        this.jari2= jari2;
    }
    public double getLuas() {
        luas=phi*Math.pow(jari2,2);
        return luas;
    }
    public double getKeliling() {
        keliling=2*phi*jari2;
        return keliling;       
    }
    protected double getJari2() {
        return jari2;
    }
    public void hasil() {
        System.out.println("Luas : "+ getLuas()); 
        System.out.println("Keliling : "+ getKeliling()); 
    }
    
}