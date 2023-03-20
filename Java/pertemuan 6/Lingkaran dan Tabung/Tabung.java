public class Tabung extends Lingkaran{
    private int tinggi;
    public Tabung(int r , int t){
        super(r);
        this.tinggi = t;
    }
    public double getVolume(){
        return super.getLuas() * this.tinggi;
    }
    public double getLuasPermukaan(){
        return 2*3.14*super.getJari()*(super.getJari()+this.tinggi);
    }
}