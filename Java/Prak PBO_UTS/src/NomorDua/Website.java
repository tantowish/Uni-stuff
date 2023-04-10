package NomorDua;

public class Website extends Account{
    private static int index=0;
    private static String[] usernames = new String[99];
    private static String[] passwords = new String[99];

    public Website(){
        super("","");
    }
    public Website(String username, String password){
        super(username,password);
        this.usernames[index]=username;
        this.passwords[index]=encrypt(password);
        index++;
        System.out.println("Akun berhasil ditambahkan!");
    }
    public Account makeAccount(String username,String password){
        for(int i=0;i<index;i++){
            if(usernames[i].equals(username)){
                System.out.println("Mohon maaf username telah digunakan");
                return null;
            }

        }
        return new Website(username, password);
    }
    public void login(String username,String password){
        for(int i=0;i<index;i++){
            if (usernames[i].equals(username) && passwords[i].equals(encrypt(password))){

                System.out.println("Login Berhasil!");
                return;
            }
            else{
                System.out.println("Akun tidak ditemukan");
                return;
            }
        }
    }
    private String encrypt(String password) {
        StringBuilder encrypt = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            if(i%2==0){
                int num = password.charAt(i);
                num += 6 * Math.pow(-1, i);
                encrypt.append((char) num);
            }
            else{
                int num = password.charAt(i)*(-1);
                num += 6 * Math.pow(-1, i);
                encrypt.append((char) num);
            }

        }
        return encrypt.toString();
    }
    @Override
    public String toString() {
        return "Account{" +
                "username='" + super.getUsername() + '\'' +
                ", password='" + encrypt(super.getPassword()) + '\'' +
                '}';
    }
}
