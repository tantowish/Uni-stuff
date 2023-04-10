package NomorTiga;

public class main {
    public static void main(String[] args) {
        Ksatria kstaria = new Ksatria("Tanto",1000000);
        Pedagang pedagang = new Pedagang("Sandy",1000000);
        Petani petani = new Petani("Miftah",1000000);
        PandaiBesi pandaiBesi = new PandaiBesi("Faadhil",1000000);
        System.out.println(kstaria);
        System.out.println(pedagang);
        System.out.println(petani);
        System.out.println(pandaiBesi);
    }
}
