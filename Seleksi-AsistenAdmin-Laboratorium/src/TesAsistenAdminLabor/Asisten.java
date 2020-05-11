package TesAsistenAdminLabor;

public class Asisten extends AsistenAdmin implements Seleksi{
    private double nilai;
    private double tMicroteaching;
    private String nama;
    private String nim;
    public Asisten (double tMicroteaching, double tTulis, double tPraktekCoding, double tWawancara, String nama, String nim) {
        super(tTulis,tPraktekCoding,tWawancara);
        this.tMicroteaching = tMicroteaching;
        this.nama = nama;
        this.nim = nim;
    }

    public double olahNilai() {
        nilai = getOlahNilai() + (tMicroteaching*0.31);
        return nilai;
    }

    public void getHasil() {
        System.out.println();
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Dinyatakan " +kelulusan(olahNilai()) + " Seleksi Asisten Laboratorium");
        System.out.println("Dengan Nilai Akhir : " + olahNilai());
        System.out.println();
    }
}