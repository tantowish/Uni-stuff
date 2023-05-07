package Nomor3;
public class Main {
    public static void main(String[] args) {
        Manager tanto = new Manager();
        HRD verlino = new HRD();
        OB faadhil = new OB();
        tanto.setTahun(2);
        verlino.setTahun(5);
        faadhil.setTahun(3);
        System.out.println(tanto.getThr());
        System.out.println(verlino.getThr());
        System.out.println(faadhil.getThr());
    }
}
