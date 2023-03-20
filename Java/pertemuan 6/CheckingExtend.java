public class CheckingExtend extends bankAccountParent{
    double limit;


    public CheckingExtend(String accNumber, double balance,double limit) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "CheckingExtend{" +
                "accNumber='" + accNumber + '\'' +
                ", balance=" + balance +
                ", limit=" + limit+
                '}';
    }
}
