package Nomor3;
import java.lang.Math;

public class HRD extends Pegawai{
    public int getThr() {
        return (int)(300000+(Math.floor(super.getTahun()/2.0))*100000);
    }
}
