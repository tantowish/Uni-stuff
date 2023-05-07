package Nomor3;
import java.lang.Math;

public class Manager extends Pegawai{
    public int getThr(){
        return (int)(Math.ceil(super.getTahun()/3.0))*300000;
    }
}
