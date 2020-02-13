import java.util.Scanner;
public class InputOutputArray{
    public static void main(String[] args) {
        String nama;
        float jumlahNilai, nilaiTotal=0, nilaiRata; 
        int nilaiMax=0, nilaiMin=0;
        int nilai[]= new int[20];
        
        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        nama= input.nextLine();
        System.out.print("Jumlah nilai yang ingin dimasukkan : ");
        jumlahNilai= input.nextInt();

        for (int i=0;i<jumlahNilai;i++) {
            System.out.print("Nilai ke - "+(i+1)+" : ");
            nilai[i]= input.nextInt();
            if (i==0) {
                nilaiMax=nilai[i];
                nilaiMin=nilaiMax;
            }
            else if (nilaiMax<nilai[i]) {
                nilaiMax=nilai[i];
            } 
            else if (nilaiMin>nilai[i]) {
                nilaiMin=nilai[i];
            }

            nilaiTotal= nilaiTotal+nilai[i];

        }
        nilaiRata=nilaiTotal/jumlahNilai;

        System.out.println("Nama : "+nama);
        System.out.println("Nilai Maximum : "+nilaiMax);
        System.out.println("Nilai Minimum : "+nilaiMin);
        System.out.println("Rata-rata Nilai : "+nilaiRata);

        input.close();
    }
}