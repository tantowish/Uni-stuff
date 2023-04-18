package Overriding2;

import java.util.List;

public class Manager extends Pegawai{
    private List<Pegawai> anakBuah;
    private Pegawai sekretaris;
    private String Ruangan;

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
    public void setSekretaris(String nip, String nama){
        Pegawai p = new Pegawai();
        p.setNama(nama);
        p.setNip(nip);
    }

    public String getRuangan() {
        return Ruangan;
    }

    public void setRuangan(String ruangan) {
        Ruangan = ruangan;
    }

    @Override
    public int getThr() {
        return super.getGaji()*2;
    }
    @Override
    public void setNip(String nip) {
        if(nip.charAt(0)=='M') {
            super.setNip(nip);
        }
        else{
            System.out.println("Gagal");
        }
    }
    @Override
    public void setNip(int urutan) {
        this.setNip((String) "M"+urutan);
    }
}
