public class bankAccountParent {
    String accNumber;
    double balance;

    public bankAccountParent(){
    }

    public bankAccountParent(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "bankAccountParent{" +
                "accNumber='" + accNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
