public class Saving {
    String accNumber;
    double balance;
    int transfers;

    public Saving(String accNumber, double balance, int transfers) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.transfers = transfers;
    }

    @Override
    public String toString() {
        return "Saving{" +
                "accNumber='" + accNumber + '\'' +
                ", balance=" + balance +
                ", transfers=" + transfers +
                '}';
    }
}
