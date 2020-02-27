
package bangunRuang;

import bangunDatar.Segitiga;

public class AlasSegitiga extends Segitiga{
    private double tinggi3,sisiTegak,sisiTegakSegitiga;
    public double volPrisma,volLimas,permukaanPrisma,permukaanLimas;

    public AlasSegitiga(double alas, double tinggi3) {
        super(alas);
        this.tinggi3= tinggi3;
    }
    public double volPrisma() {
        volPrisma =super.getluas()*tinggi3;
        return volPrisma;
    }
    public double permukaanPrisma() {
        sisiTegak = super.getAlas()*tinggi3;
        permukaanPrisma = sisiTegak*3+2*super.getluas();
        return permukaanPrisma;
    }
    public double volLimas() {
        volLimas = volPrisma()/3;
        return volLimas;
    }
    public double permukaanLimas() {
        sisiTegakSegitiga = Math.sqrt(Math.pow((super.getAlas()/2),2)+Math.pow(tinggi3,2)); 
        sisiTegak = super.getAlas()*sisiTegakSegitiga/2;
        permukaanLimas = sisiTegak*3+super.getluas();
        return permukaanLimas;
    }
    public void hasil() {
        System.out.println("Prisma Segitiga : "+ volPrisma());
        System.out.println("Limas Segitiga : "+ volLimas());
        System.out.println("Luas Permukaan Prisma : "+ permukaanPrisma());
        System.out.println("Luas Permukaan Limas : "+ permukaanLimas());
    }
}
