package Nomor1;

public abstract class  Prisma {
    private double tinggi;
    public abstract double volume();
    public abstract double luasPermukaan();
    public abstract double luasAlas();
    public void deskripsi(){
        System.out.println("Volume : "+this.volume());
        System.out.println("Luas Permukaan : "+this.luasPermukaan());
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
