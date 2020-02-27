
package bangunRuang;

import bangunDatar.Persegi;

public class AlasPersegi extends Persegi {
    public double volPrisma,volLimas,permukaanPrisma,permukaanLimas;
    private double sisiTegakSegitiga,sisiTegak;

    public AlasPersegi(double sisi) {
        super(sisi);
    }
    public double volPrisma() {
        volPrisma =super.getSisi()*super.getLuas();
        return volPrisma;
    }
    public double permukaanPrisma() {
        permukaanPrisma = super.getLuas()*6;
        return permukaanPrisma;
    }
    public double volLimas() {
        volLimas = volPrisma()/3;
        return volLimas;
    }
    public double permukaanLimas() {
        sisiTegakSegitiga = Math.sqrt(Math.pow((super.getSisi()/2),2)+Math.pow(super.getSisi(),2)); 
        sisiTegak = sisiTegakSegitiga*super.getSisi()/2;
        permukaanLimas = super.getLuas()+sisiTegak*4;
        return permukaanLimas;
    }
    public void hasil() {
        System.out.println("Balok : "+ volPrisma());
        System.out.println("Limas Persegi : "+ volLimas());
        System.out.println("Luas Permukaan Balok : "+ permukaanPrisma());
        System.out.println("Luas Permukaan Limas : "+ permukaanLimas());
    }
}
