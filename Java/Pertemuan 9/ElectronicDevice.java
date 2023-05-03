public abstract class ElectronicDevice {
    private String kode,merk;
    private int harga,diskon;

    public abstract  void turnOn();
    public abstract void turnOff();
    public abstract int garansi();
    public int hargaSetelahDiskon(){
        return harga-(diskon/100*harga);
    }
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
}
