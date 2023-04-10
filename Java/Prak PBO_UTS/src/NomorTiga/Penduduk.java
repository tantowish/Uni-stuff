package NomorTiga;

public class Penduduk {
    private String nama;
    private int pendapatan;
    public Penduduk(String nama, int pendapatan){
        this.nama=nama;
        this.pendapatan=pendapatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(int pendapatan) {
        this.pendapatan = pendapatan;
    }

    @Override
    public String toString() {
        return "=======================" +
                "\nPenduduk{" +
                "nama='" + nama + '\'' +
                ", pendapatan=" + pendapatan +
                '}';
    }
}
