import java.time.LocalDate;

public class Deposito {
    String accNumber;
    double balance;
    LocalDate expiry;

    public Deposito(String accNumber, double balance, LocalDate expiry) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "accNumber='" + accNumber + '\'' +
                ", balance=" + balance +
                ", expiry=" + expiry +
                '}';
    }
}
