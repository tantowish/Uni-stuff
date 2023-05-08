package Univ;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa implements Pelatihan,Fasilitas{
    private String nim,nama,kelas,prodi;
    private int semester,izin;
    private double ipk;

    public boolean isEligible() {
        return ipk>3 && semester<8;
    }

    public void orientasi(String hari) {
        List<String> namaHari=new ArrayList<>();
        namaHari.add("minggu");
        namaHari.add("sabtu");
        if(!namaHari.contains(hari)){
            izin++;
        }
    }

    public boolean isEligibleBeasiswa() {
        return ipk>=3.5;
    }

    public int nominalBeasiswa() {
        if(isEligibleBeasiswa()&&ipk==4){
            return 2000000;
        }
        else if(isEligibleBeasiswa()){
            return 1000000;
        }
        return 0;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getIzin() {
        return izin;
    }

    public void setIzin(int izin) {
        this.izin = izin;
    }
}
