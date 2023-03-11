import java.util.Scanner;
public class vehicleMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n =5;
        Vehicle [] data = new Vehicle[n];
        for(int i=0;i<data.length;i++){
            System.out.println("Data ke-"+(i+1));
            System.out.print("Passangers  : ");
            Double psg = inp.nextDouble();
            System.out.print("Fuelcap     : ");
            Double fcp = inp.nextDouble();
            System.out.print("Miles/gallon : ");
            Double mpg = inp.nextDouble();
            System.out.print("Price       : ");
            Double price=inp.nextDouble();
            data[i]=new Vehicle(psg,fcp,mpg,price);
            System.out.println();
        }
        for(int i=0;i<data.length;i++){
            System.out.println((i+1)+". "+data[i].toString());
        }
        inp.close();
       
    }
}
