package Overriding2;

public class Main {
    public static void main(String[] args) {
        Salesman mamad= new Salesman();
//        mamad.setGaji(500000,200000,50000);
//        System.out.println(mamad.getGaji());
        mamad.setNip("S10");
        mamad.setGaji(100000);
        mamad.setPenjualan(1);
        mamad.setTarget(2);
        System.out.println(mamad.getThr());
        Manager tanto = new Manager();
        tanto.setMale(true);
        tanto.setCuti("persalinan");
        System.out.println(tanto.getCuti());
        Pegawai shyra = new Pegawai();
        shyra.setMale(false);
        shyra.setCuti("persalinan");
        System.out.println(shyra.getCuti());
        shyra.setNip(20);
        System.out.println(shyra.getNip());
    }
}
