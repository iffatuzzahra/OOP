package main;
import java.util.Scanner;

import bangunDatar.Persegi;
import bangunDatar.Segitiga;
import bangunDatar.Lingkaran;
import bangunRuang.AlasPersegi;
import bangunRuang.AlasSegitiga;
import bangunRuang.AlasLingkaran;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int pilih,pMenu;
        char y;
        do {
            System.out.println("Menu : ");
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga Sama Sisi");
            System.out.println("3. Lingkaran");
            System.out.print("Pilih : ");
            pilih = input.nextInt();

            if (pilih==1||pilih==2||pilih==3) {
                System.out.println("Menu Bangun ");
                System.out.println("1. Bangun Datar");
                System.out.println("2. Bangun Ruang");
                System.out.print("Pilih Bangun : ");
                pMenu = input.nextInt();
            
                if (pilih==1&&(pMenu==1||pMenu==2)) {
                    int sisi;
                    System.out.print("Masukkan panjang sisi persegi: ");
                    sisi = input.nextInt();

                    if (pMenu==1) {
                        Persegi persegi = new Persegi(sisi);
                        persegi.hasil();
                    }else
                    if (pMenu==2) {
                        AlasPersegi dimensi3 = new AlasPersegi(sisi);
                        System.out.println("Menghitung Balok dan Limas Persegi ");
                        dimensi3.hasil();
                    }
                }else 
                if (pilih==2&&(pMenu==1||pMenu==2)) {
                    int alas;
                    System.out.print("Masukkan panjang sisi segitiga: ");
                    alas = input.nextInt();

                    if (pMenu==1) { 
                        Segitiga segitiga = new Segitiga(alas);
                        segitiga.hasil();
                    }else
                    if (pMenu==2) {
                        int tinggi3;
                        System.out.print("Masukkan tinggi bangun ruang beralas segitiga : ");
                        tinggi3 = input.nextInt();
                        AlasSegitiga dimensi3 = new AlasSegitiga(alas,tinggi3);
                        System.out.println("Menghitung Prisma dan Limas Persegi ");
                        dimensi3.hasil();
                    }
                } else 
                if (pilih==3&&(pMenu==1||pMenu==2)) {
                    int jari2;
                    System.out.print("Masukkan panjang jari-jari lingkaran : ");
                    jari2 = input.nextInt();

                    if (pMenu==1) { 
                        Lingkaran lingkaran = new Lingkaran(jari2);
                        lingkaran.hasil();
                    } else
                    if (pMenu==2) {
                        int tinggi;
                        System.out.print("Masukkan tinggi bangun ruang : ");
                        tinggi = input.nextInt();
                        AlasLingkaran dimensi3 = new AlasLingkaran(jari2,tinggi);
                        System.out.println("Menghitung Tabung dan Kerucut ");
                        dimensi3.hasil();
                    }
                } else {
                    System.out.println("Menu tidak tersedia");
                }
            } else {
                System.out.println("Maaf menu tidak tersedia");
            }
            System.out.print("Kembali ke Menu ?? (y/n) : ");
            y = input.next().charAt(0);
        } while (y=='Y'||y=='y');
        input.close();
    }
}
