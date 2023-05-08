package Univ;

import java.util.ArrayList;
import java.util.List;

public class Dosen extends Pegawai implements Pelatihan, Fasilitas{
    private double edom;
    private String jabatanStruktural;
    private int jmlBimbinganDpa, jmlMatkul;
    private List<String> matkul=new ArrayList<>();

    public boolean isEligible() {
        return !jabatanStruktural.isEmpty();
    }

    public void orientasi(String hari) {
        List<String> namaHari=new ArrayList<>();
        namaHari.add("minggu");
        namaHari.add("sabtu");
        if(namaHari.contains(hari)){
            super.addCuti();
        }
    }

    public boolean isEligibleBeasiswa() {
        return edom>3.5;
    }

    public int nominalBeasiswa() {
        if(isEligibleBeasiswa()){
            return matkul.size()*1000000;
        }
        return 0;
    }

    public double getEdom() {
        return edom;
    }

    public void setEdom(double edom) {
        this.edom = edom;
    }

    public String getJabatanStruktural() {
        return jabatanStruktural;
    }

    public void setJabatanStruktural(String jabatanStruktural) {
        this.jabatanStruktural = jabatanStruktural;
    }

    public int getJmlBimbinganDpa() {
        return jmlBimbinganDpa;
    }

    public void setJmlBimbinganDpa(int jmlBimbinganDpa) {
        this.jmlBimbinganDpa = jmlBimbinganDpa;
    }

    public int getJmlMatkul() {
        return jmlMatkul;
    }

    public void setJmlMatkul(int jmlMatkul) {
        this.jmlMatkul = jmlMatkul;
    }

    public List<String> getMatkul() {
        return matkul;
    }

    public void setMatkul(List<String> matkul) {
        this.matkul = matkul;
    }
}
