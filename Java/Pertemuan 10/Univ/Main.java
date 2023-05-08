package Univ;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dosen margareta = new Dosen();
        margareta.setEdom(4);
        List<String> matkul=new ArrayList<>();
        matkul.add("PPBO");
        matkul.add("PTI");
        margareta.setMatkul(matkul);
        matkul.add("PKN");
        System.out.println(margareta.isEligibleBeasiswa());
        System.out.println(margareta.nominalBeasiswa());

        Mahasiswa tanto = new Mahasiswa();
        tanto.setIpk(3.9);
        System.out.println(tanto.isEligibleBeasiswa());
        System.out.println(tanto.nominalBeasiswa());
    }
}
