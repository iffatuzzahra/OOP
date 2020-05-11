package TesAsistenAdminLabor;

public class AsistenAdmin {
    protected double nilai;
    private double tTulis;
    private double tPraktekCoding;
    private double tWawancara;

    public AsistenAdmin (double tTulis, double tPraktekCoding, double tWawancara) {
        this.tTulis = tTulis;
        this.tPraktekCoding = tPraktekCoding;
        this.tWawancara = tWawancara;
    }
    public String kelulusan(double nilai) {
        if (nilai>85) {
            return "LULUS";
        } else {
            return "BELUM LULUS";
        }
    }
	public double getOlahNilai() {
        nilai = (tTulis*0.23) + (tPraktekCoding*0.23) + (tWawancara*0.23);
		return nilai;
	}
}