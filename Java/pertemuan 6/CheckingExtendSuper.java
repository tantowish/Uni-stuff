public class CheckingExtendSuper extends bankAccountParent {
    double limit;

    public CheckingExtendSuper(String accNumber, double balance, double limit) {
        super(accNumber, balance); //Memanggil parameterized constructor dari parent
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "CheckingExtendSuper{" +
                "accNumber='" + accNumber + '\'' +
                ", balance=" + balance +
                ", limit=" + limit +
                '}';
    }
}
