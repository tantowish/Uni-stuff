package NomorDua;

public class main {
    public static void main(String[] args) {
        Website website = new Website();
        Account a = website.makeAccount("Si Madun","ABCD");
        Account b = website.makeAccount("Si Madun","ABCD");
        System.out.println(a);
        System.out.println(b);
        website.login("Si Madun","Gaasdw");
        website.login("Si Madun","ABCD");
    }
}
