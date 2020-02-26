
package bangunRuang;

import bangunDatar.Lingkaran;

public class AlasLingkaran extends Lingkaran {
    private double tinggi;
    public double volPrisma,volLimas,permukaanPrisma,permukaanLimas,garisPelukis;
    double phi=3.14;

    public AlasLingkaran(double jari2, double tinggi) {
        super(jari2);
        this.tinggi= tinggi;
    }
    public double volPrisma() {
        volPrisma =super.getLuas()*tinggi;
        return volPrisma;
    }
    public double permukaanPrisma() {
        permukaanPrisma = super.getLuas()*2+super.getKeliling()*tinggi;
        return permukaanPrisma;
    }
    public double volLimas() {
        volLimas = volPrisma()/3;
        return volLimas;
    }
    public double permukaanLimas() {
        garisPelukis = Math.sqrt(Math.pow(super.getJari2(),2)+Math.pow(tinggi,2));
        permukaanLimas = super.getLuas()+phi*super.getJari2()*garisPelukis;
        return permukaanLimas;
    }
    public void hasil() {
        System.out.println("Balok : "+ volPrisma());
        System.out.println("Limas Persegi : "+ volLimas());
        System.out.println("Luas Permukaan Balok : "+ permukaanPrisma());
        System.out.println("Luas Permukaan Limas : "+ permukaanLimas());
    }
}