package Nomor2;

public class Pegawai extends Thr {
    private int gaji;

    public void Thr(Pelajar p) {
        p.setJumlahThr(p.thrAmount());
        System.out.println("Jumlah THR yang diberikan : " + p.thrAmount());
        System.out.println("Sisa gaji : " + this.GajiAfterThr(p.thrAmount()));
    }
    public void Thr(Pegawai p) {
        System.out.println("Tidak dapat memberi thr sesama Pegawai");
    }
    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public int GajiAfterThr(int thr){
        this.gaji-=thr;
        return this.gaji;
    }
}

