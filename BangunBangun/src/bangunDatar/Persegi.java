
package bangunDatar;


public class Persegi {
    private double sisi;
    public double luas,keliling;

    public Persegi(double sisi) {
        this.sisi=sisi;
    }
    public double getLuas() {
        luas=Math.pow(sisi,2);
        return luas;
    }
    public double getKeliling() {
        keliling=sisi*4;   
        return keliling;  
    }
    protected double getSisi(){
        return sisi;
    }
    public void hasil() {
        System.out.println("Luas : "+ getLuas()); 
        System.out.println("Keliling : "+ getKeliling()); 
    }
    
}