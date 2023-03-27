package Quiz3;

public class Main {
    public static void main(String[] args) {
        Square kotak = new Square(2,"Pink",true);
        System.out.println("toString Square:\n"+kotak);
        System.out.println("\nMethod pada Shape : ");
        kotak.setColor("Pink");
        System.out.println("color="+kotak.getColor());
        kotak.setFilled(false);
        System.out.println("isFilled="+kotak.isFilled());
        System.out.println("\ntoString Square setelah dilakukan set :\n"+kotak);
    }
}
