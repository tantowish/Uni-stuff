package Univ;

public class Pegawai {
    private String nip, nama, departemen;
    private int gaji, tahun,totalCuti;


    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getTotalCuti() {
        return totalCuti;
    }

    public void addCuti(){
        this.totalCuti++;
    }
    public void setTotalCuti(int totalCuti) {
        this.totalCuti = totalCuti;
    }
}
