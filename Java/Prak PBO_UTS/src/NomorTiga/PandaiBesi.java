package NomorTiga;

public class PandaiBesi extends Penduduk{
    public PandaiBesi(String nama, int pendapatan){
        super(nama,pendapatan);
    }
    public double pajak(){
        return super.getPendapatan()*0.06;
    }
    public double bayar(){
        return super.getPendapatan()-this.pajak();
    }

    @Override
    public String toString() {
        return "=======================" +
                "\nPandai Besi\n"+
                "Nama: "+super.getNama()+
                "\nPendapatan: "+super.getPendapatan()
                +"\nPendapatan setelah bayar pajak: "+(int) this.bayar();
    }
}
