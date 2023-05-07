package Nomor1;

public class PrismaSegitiga extends Prisma{
    private double alas, tinggiAlas;
    public double luasAlas() {
        return 0.5*alas*tinggiAlas;
    }
    public double luasPermukaan() {
        return alas*super.getTinggi()+2*(0.5*alas*tinggiAlas+alas*super.getTinggi());
    }
    public double volume() {
        return this.luasAlas()*super.getTinggi();
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggiAlas() {
        return tinggiAlas;
    }

    public void setTinggiAlas(double tinggiAlas) {
        this.tinggiAlas = tinggiAlas;
    }
}
