public class Checking {
    String accNumber;
    double balance;
    double limit;

    public Checking(String accNumber, double balance, double limit) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Checking{" +
                "accNumber='" + accNumber + '\'' +
                ", balance=" + balance +
                ", limit=" + limit +
                '}';
    }
}
