
package bangunDatar;


public class Segitiga {
    private double alas,sisiTegak;
    public double luas,keliling;

    public Segitiga(double alas) {
        this.alas=alas;
    }
    public double getluas() {
        sisiTegak = Math.sqrt(Math.pow(alas,2)-Math.pow((alas/2),2));
        luas=(alas*sisiTegak)/2;
        return luas;
    }
    public double getKeliling() {
        keliling=3*alas;  
        return keliling;  
    }
    protected double getAlas(){
        return alas;
    }
    public void hasil() {
        System.out.println("Luas : "+ getluas()); 
        System.out.println("Keliling : "+ getKeliling()); 
    }
    
}