package NomorTiga;

public class Ksatria extends Penduduk{
    public Ksatria(String nama, int pendapatan){
        super(nama,pendapatan);
    }
    public double pajak(){
       return super.getPendapatan()*0.18;
    }
    public double bayar(){
        return super.getPendapatan()-this.pajak();
    }

    @Override
    public String toString() {
        return "=======================" +
                "\nKsatria\n"+
                "Nama: "+super.getNama()+
                "\nPendapatan: "+super.getPendapatan()
                +"\nPendapatan setelah bayar pajak: "+(int) this.bayar();
    }
}
