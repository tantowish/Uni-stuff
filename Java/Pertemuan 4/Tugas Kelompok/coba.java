import java.util.*;
public class coba{
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n=5;
    Vehicle[] mobil = new Vehicle[n];
    String insert;
    String[] strArr = new String[4];
    Double[] intArr = new Double[4];
    for(int i=0;i<n;i++){
        insert = inp.nextLine();
        strArr=insert.split(" ");
        for(int j=0;j<strArr.length;j++){
            intArr[j] = Double.parseDouble(strArr[j]);
          }
          mobil[i]=new Vehicle(intArr[0],intArr[1],intArr[2],intArr[3]);
    }
    for(Vehicle i:mobil){
        System.out.println(i.toString());
    }
  }
} 