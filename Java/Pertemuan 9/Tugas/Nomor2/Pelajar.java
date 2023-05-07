package Nomor2;

public class Pelajar extends Thr{
    private int umur;
    private int jumlahThr;

    public void Thr(Pelajar p) {
        System.out.println("Pelajar tidak dapat memberi Thr");
    }
    public void Thr(Pegawai p) {
        this.setJumlahThr(this.thrAmount());
        System.out.println("Jumlah THR yang diterima: " + this.thrAmount());
    }

    public int thrAmount(){
        return (umur*10/5)*1000;
    }
    public int getJumlahThr() {
        return jumlahThr;
    }

    public void setJumlahThr(int Thr) {
        this.jumlahThr += Thr;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
