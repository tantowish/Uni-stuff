package Quiz2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Faadhil","Bantul");
        Person person2 = new Person("Ghifari","Congdong Catur");
        Person person3 = new Person("Fabih","Sendowo");
        System.out.println("toString Person:");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println("\nMencoba semua method Person :");
        System.out.println("person 1");
        person1.setName("Faadhil Suryo");
        System.out.println(person1.getName());
        person1.setName("Bantul Selatan");
        System.out.println(person1.getAddress());
        System.out.println(person1);

        System.out.println("person 2");
        person2.setName("Ghifari Raya");
        System.out.println(person2.getName());
        person2.setAddress("Condong Catur Dekat Indomaret");
        System.out.println(person2.getAddress());
        System.out.println(person2);

        System.out.println("person 3");
        person3.setName("Muhammad Nur Kafabih");
        System.out.println(person3.getName());
        person3.setAddress("Sendowo Karawtin");
        System.out.println(person3.getAddress());
        System.out.println(person3);

        Student student1 = new Student("Shyra","Ngadimulyo","D4",2022,0);
        Student student2 = new Student("Tanto","Sendowo","S2",2027,12000000);
        Student student3 = new Student("Caca","Jakal atas","D4",2022,10000000);
        System.out.println("\ntoString Student :");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("\nMencoba semua method Student :");
        System.out.println("Student 1");
        System.out.println(student1.getProgram());
        System.out.println(student1.getYear());
        System.out.println(student1.getFee());

        System.out.println("Student 2");
        System.out.println(student2.getProgram());
        System.out.println(student2.getYear());
        System.out.println(student2.getFee());

        System.out.println("Student 3");
        System.out.println(student3.getProgram());
        System.out.println(student3.getYear());

        Staff staff1 = new Staff("Naufal","Pogung","UGM",2000000);
        Staff staff2 = new Staff("Bu nana","Klaten","UGM",100000000);
        Staff staff3 = new Staff("Rahman","Randik","UNSRI",6000000);
        System.out.println("\ntoString Staff : ");
        System.out.println(staff1);
        System.out.println(staff2);
        System.out.println(staff3);

        System.out.println("\nMencoba semua method Staff :");
        System.out.println("Staff 1");
        System.out.println(staff1.getSchool());
        System.out.println(staff1.getPay());

        System.out.println("Staff 2");
        System.out.println(staff2.getSchool());
        System.out.println(staff2.getPay());

        System.out.println("Staff 3");
        System.out.println(staff3.getSchool());
        System.out.println(staff3.getPay());
    }
}
