package NomorTiga;

public class Petani extends Penduduk{
    public Petani(String nama, int pendapatan){
        super(nama,pendapatan);
    }
    public double pajak(){
        return super.getPendapatan()*0.03;
    }
    public double bayar(){
        return super.getPendapatan()-this.pajak();
    }

    @Override
    public String toString() {
        return "=======================" +
                "\nPetani\n"+
                "Nama: "+super.getNama()+
                "\nPendapatan: "+super.getPendapatan()
                +"\nPendapatan setelah bayar pajak: "+(int) this.bayar();
    }
}
