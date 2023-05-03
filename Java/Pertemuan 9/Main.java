public class Main {
    public static void main(String[] args) {
        Computer cp = new Computer();
        cp.turnOff();
        cp.setHarga(10000000);
        cp.setDiskon(10);
        System.out.println(cp.hargaSetelahDiskon());
    }
}