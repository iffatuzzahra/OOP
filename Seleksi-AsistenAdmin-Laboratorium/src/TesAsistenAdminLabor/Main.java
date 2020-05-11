package TesAsistenAdminLabor;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int pilih=0;
        char y;
        double tTulis=0;
        double tPraktekCoding=0;
        double tWawancara=0;
        double tMicroteaching=0;
        double tJaringan=0;
        String nama;
        String nim;

        do {
            System.out.println();
            System.out.println("Menu : ");
            System.out.println("1. Asisten Laboratorium");
            System.out.println("2. Admin Laboratorium");
        
            try {   System.out.print("Pilih : ");
                pilih = input.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Input Berupa Angka!");   
            }
            try {
                if (pilih==1||pilih==2) {
                    System.out.println();
                    System.out.print("Masukkan Nama : ");
                    nama = input.next();
                    System.out.print("Masukkan NIM : ");
                    nim = input.next();
                    System.out.println();
                    
                    System.out.print("Masukkan Nilai Tes Tulis : ");
                    tTulis = input.nextInt();
                    System.out.print("Masukkan Nilai Tes Praktek Coding : ");
                    tPraktekCoding = input.nextInt(); 
                    System.out.print("Masukkan Nilai Tes Wawancara : ");
                    tWawancara = input.nextInt(); 

                    if (pilih==1) { 
                        System.out.print("Masukkan Nilai Tes Microteaching : ");
                        tMicroteaching = input.nextInt();
                        Asisten asisten = new Asisten(tMicroteaching,tTulis,tPraktekCoding,tWawancara,nama,nim);
                        asisten.getHasil();
                    } 
                    else if (pilih==2) { 
                        System.out.print("Masukkan Nilai Tes Praktek Jaringan : ");
                        tJaringan = input.nextInt(); 
                        Admin admin = new Admin(tJaringan,tTulis,tPraktekCoding,tWawancara,nama,nim);
                        admin.getHasil();
                    }
                }
                else {
                    System.out.println("Maaf menu tidak tersedia");
                }
            System.out.print("Kembali ke Menu ?? (y/n) : ");
            } catch (InputMismatchException e){
                System.err.println("Input Berupa Angka!"); 
                System.out.print("Kembali ke Menu ?? (y/n) : ");
                y = input.next().charAt(0);  
            }
            y = input.next().charAt(0);
        } while (y=='Y'||y=='y');
        input.close();
    }
}