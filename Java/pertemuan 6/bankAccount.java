import java.time.LocalDate;

public class bankAccount {
    String accnumber;
    double balance;
    double limit; //check
    int transfers;
    LocalDate expiry;
    String codeAcc;

    public bankAccount(String accnumber, double balance, double limit, int transfers, LocalDate expiry, String codeAcc) {
        this.accnumber = accnumber;
        this.balance = balance;
        this.limit = limit;
        this.transfers = transfers;
        this.expiry = expiry;
        this.codeAcc = codeAcc;
    }

    @Override
    public String toString() {
        return "bankAccount{" +
                "accnumber='" + accnumber + '\'' +
                ", balance=" + balance +
                ", limit=" + limit +
                ", transfers=" + transfers +
                ", expiry=" + expiry +
                ", codeAcc='" + codeAcc + '\'' +
                '}';
    }
}
