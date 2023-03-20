public class Lingkaran {
    private int jari;
    public Lingkaran(int r){
        this.jari = r;
    }
    public int getJari(){
        return this.jari;
    }
    public double getLuas(){
        return this.jari * this.jari * 3.14;
    }
}
