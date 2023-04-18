package Overriding2;

public class Salesman extends Pegawai{
    private int bonus, target, penjualan;

    @Override
    public int getGaji() {
        return super.getGaji()+this.getBonus();
    }
    public int getBonus() {
        return bonus;
    }
    public void setGaji(){
        super.setGaji(500000);
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }
    @Override
    public int getThr() {
        if (this.penjualan>=this.target){
            return super.getGaji()*2;
        }
        else{
            return super.getGaji();
        }
    }
    @Override
    public void setNip(String nip) {
        if(nip.charAt(0)=='S') {
            super.setNip(nip);
        }
        else{
            System.out.println("Gagal");
        }
    }

    @Override
    public void setNip(int urutan) {
        this.setNip((String) ("S"+urutan));
    }
}
