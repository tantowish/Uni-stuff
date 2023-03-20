import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate tanggal0 = LocalDate.now();
        LocalDate tanggal1 = LocalDate.of(2020,1,1);
        bankAccount akunCheck = new bankAccount("123-456",999,9000,0,tanggal0,"Checking");
        bankAccount akunSaving = new bankAccount("333-111",500,0,3,tanggal0,"Saving");
        bankAccount akunDeposito = new bankAccount("975-579",12000,0,0,tanggal1,"Deposito");

        System.out.println(akunCheck);
        System.out.println(akunSaving);
        System.out.println(akunDeposito);

        Checking akunCheck2 = new Checking("123-456",999,9000);
        Saving akunSaving2 = new Saving("333-111",500,3);
        Deposito akunDeposito2 = new Deposito("975-579",999,tanggal1);
        System.out.println(akunCheck2);
        System.out.println(akunSaving2);
        System.out.println(akunDeposito2);

        // Setelah ditambahkan extend
        CheckingExtend akunCheck3 = new CheckingExtend("123-123",999,9000);
        System.out.println("\n\nHasil pembuatan objek dengan extend ke parent class");
        System.out.println(akunCheck3);

        // Setelah ditambahkan extend super
        CheckingExtendSuper akunCheck4 = new CheckingExtendSuper("123-123",999,9000);
        System.out.println("\n\nHasil pembuatan objek dengan extend ke parentclass dengan superclass");
        System.out.println(akunCheck4);
    }
}