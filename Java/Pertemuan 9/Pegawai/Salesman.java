package Pegawai;

public class Salesman extends Pegawai{
    private int penjualan, target,bonus;

    public boolean checkNip(String nip){
        if (nip.charAt(0)=='S'){
            return true;
        }
        else{
            return false;
        }
    }

    public int getThr() {
        if (this.penjualan>=this.target){
            return super.getGaji()*2;
        }
        else{
            return super.getGaji();
        }
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
