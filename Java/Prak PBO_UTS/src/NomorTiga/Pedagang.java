package NomorTiga;

public class Pedagang extends Penduduk{
    public Pedagang(String nama, int pendapatan){
        super(nama,pendapatan);
    }
    public double pajak(){
        return super.getPendapatan()*0.12;
    }
    public double bayar(){
        return super.getPendapatan()-this.pajak();
    }

    @Override
    public String toString() {
        return "=======================" +
                "\nPedagang\n"+
                "Nama: "+super.getNama()+
                "\nPendapatan: "+super.getPendapatan()
                +"\nPendapatan setelah bayar pajak: "+(int) this.bayar();
    }
}
