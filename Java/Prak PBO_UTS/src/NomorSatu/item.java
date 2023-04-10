package NomorSatu;
public class item {
    private static item items[]=new item[1000];
    private static int counter=0;
    private int harga,quantity;
    private static int hartot=0;
    private String nama;
    private char rank;
    public item(int harga, String nama, char rank, int quantity){
        this.harga=harga*quantity;
        this.nama=nama;
        this.rank=rank;
        this.quantity=quantity;
        this.hartot+=this.harga;
        items[counter]=this;
        counter++;
    }
    public void seeAllItem(){
        System.out.println("Your item backpack worth: "+this.hartot+" with item listed below:");
        for (int i=0;i<counter;i++){
            System.out.println(items[i].quantity+" "+items[i].rank+" "+items[i].nama+" worth: "+items[i].harga);
        }
    }
}
