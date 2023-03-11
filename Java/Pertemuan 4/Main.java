public class Main {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(6,20,3);
        Vehicle sportscar = new Vehicle(2,14,5);
        System.out.println("Minivan can carry "+minivan.passangers + " with a range of "+minivan.getRange());
        System.out.println("Minivan can carry "+sportscar.passangers + " with a range of "+sportscar.getRange());
        minivan.range();
        System.out.println(minivan.toString());
        System.out.println(sportscar.toString());
    }
}
