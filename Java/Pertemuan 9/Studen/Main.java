package Studen;

public class Main {
    public static void main(String[] args) {
        internationalStudent tanto = new internationalStudent();
        tanto.setIpk(3.84);
        tanto.registrasi();
        System.out.println(tanto.gradeIPK());
        System.out.println("kelas : "+ tanto.getKelas());

        regStudent verlino = new regStudent();
        verlino.setIpk(3.43);
        verlino.registrasi();
        System.out.println(verlino.gradeIPK());
        System.out.println("kelas : "+ verlino.getKelas());
    }
}
