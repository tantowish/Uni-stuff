package Pegawai;

import java.util.List;

public class Manager extends Pegawai{
    private List<Pegawai> anakBuah;
    private Pegawai sekretaris;
    private String Ruangan;
    public int getThr(){
        return super.getGaji()*2;
    }
    public boolean checkNip(String nip){
        if(nip.charAt(0)=='M'){
            return true;
        }
        else{
            return false;
        }
    }
    public List<Pegawai> getAnakBuah() {
        return anakBuah;
    }

    public void setAnakBuah(List<Pegawai> anakBuah) {
        this.anakBuah = anakBuah;
    }

    public Pegawai getSekretaris() {
        return sekretaris;
    }

    public void setSekretaris(Pegawai sekretaris) {
        this.sekretaris = sekretaris;
    }

    public String getRuangan() {
        return Ruangan;
    }

    public void setRuangan(String ruangan) {
        Ruangan = ruangan;
    }
}
