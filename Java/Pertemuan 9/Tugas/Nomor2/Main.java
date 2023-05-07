package Nomor2;


public class Main {
    public static void main(String[] args) {
        Pegawai tanto = new Pegawai();
        Pelajar bocil = new Pelajar();
        Pelajar bocil2 = new Pelajar();
        tanto.setGaji(500000);
        bocil.setUmur(5);
        tanto.Thr(bocil);
        bocil.Thr(tanto);
        bocil2.setUmur(15);
        bocil2.Thr(tanto);
        Pegawai verlino = new Pegawai();
        verlino.setGaji(600000);
        verlino.Thr(bocil2);
        tanto.Thr(verlino);
    }
}
