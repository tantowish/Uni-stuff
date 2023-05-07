package Nomor3;

public abstract class Pegawai {
    private int umur, tahun;
    private String nama;
    public abstract int getThr();
    public int getUmur() {return umur;}
    public void setUmur(int umur) {this.umur = umur;}
    public int getTahun() {return tahun;}
    public void setTahun(int tahun) {this.tahun = tahun;}
    public String getNama() {return nama;}
    public void setNama(String nama) {this.nama = nama;}
}
