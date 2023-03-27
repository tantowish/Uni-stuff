package Quiz1;

public class Main {
    public static void main(String[] args) {
        Cylinder C1 = new Cylinder();
        Cylinder C2 = new Cylinder(2);
        Cylinder C3 = new Cylinder(2,5);
        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);

        System.out.println("\nMenjalankan semua method pada objek 1 : ");
        C1.setRadius(2.5);
        System.out.println("radius= "+C1.getRadius());
        C1.setColor("blue");
        System.out.println("color="+C1.getColor());
        C1.setHeight(1);
        System.out.println("height="+C1.getHeight());
        System.out.println("Area="+C1.getArea());
        System.out.println("Volume="+C1.getVolume());
        System.out.println(C1);

        System.out.println("\nMenjalankan semua method pada objek 2 : ");
        C2.setRadius(4);
        System.out.println("radius= "+C2.getRadius());
        C2.setColor("pink");
        System.out.println("color="+C2.getColor());
        C2.setHeight(2);
        System.out.println("height="+C2.getHeight());
        System.out.println("Area="+C2.getArea());
        System.out.println("Volume="+C2.getVolume());
        System.out.println(C2);

        System.out.println("\nMenjalankan semua method pada objek 3 : ");
        C3.setRadius(3);
        System.out.println("radius= "+C3.getRadius());
        C3.setColor("pink");
        System.out.println("color="+C3.getColor());
        C3.setHeight(4);
        System.out.println("height="+C3.getHeight());
        System.out.println("Area="+C1.getArea());
        System.out.println("Volume="+C1.getVolume());
        System.out.println(C3);
    }
}