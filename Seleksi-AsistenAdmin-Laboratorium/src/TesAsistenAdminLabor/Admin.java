package TesAsistenAdminLabor;

public class Admin extends AsistenAdmin implements Seleksi{
    private double nilai;
    private double tJaringan;
    private String nama;
    private String nim;
    public Admin (double tJaringan, double tTulis, double tPraktekCoding, double tWawancara, String nama, String nim) {
        super(tTulis,tPraktekCoding,tWawancara);
        this.tJaringan = tJaringan;
        this.nama = nama;
        this.nim = nim;
    }

    public double olahNilai() {
        nilai = getOlahNilai() + (tJaringan*0.31);
        return nilai;
    }

    @Override
    public void getHasil() {
        System.out.println();
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Dinyatakan " +kelulusan(olahNilai()) + " Seleksi Admin Laboratorium");
        System.out.println("Dengan Nilai Akhir : " + olahNilai());
        System.out.println();
    }
}