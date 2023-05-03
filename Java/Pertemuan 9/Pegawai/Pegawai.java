package Pegawai;

public abstract class Pegawai {
    private String nama;
    private String nip;
    private String departement;
    private String posisi;
    private int gaji;
    private int cuti;
    private boolean isMale;

    public abstract int getThr();
    public abstract boolean checkNip(String nip);

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        if(checkNip(nip)){
            this.nip=nip;
        }
        else{
            System.out.println("Gagal");
        }
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getCuti() {
        return cuti;
    }

    public void setCuti(int cuti) {
        this.cuti += cuti;
    }

    public void setCuti(String tipeCuti) {
        if(tipeCuti.equalsIgnoreCase("pernikahan")){
            this.cuti+=2;
        }
        else if(tipeCuti.equalsIgnoreCase("persalinan")){
            if (this.isMale==true){
                this.cuti+=3;
            }
            else{
                this.cuti+=90;
            }

        }
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
