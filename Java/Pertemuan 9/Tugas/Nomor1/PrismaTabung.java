package Nomor1;

public class PrismaTabung extends Prisma{
    public double r;

    public double volume() {
        return 3.14*r*r*super.getTinggi();
    }

    public double luasAlas() {
        return 3.14*r*r;
    }

    public double luasPermukaan() {
        return 2*this.luasAlas()+2*3.14*r*super.getTinggi();
    }
}
