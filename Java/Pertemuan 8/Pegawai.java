package Overriding2;

public class Pegawai {
    private String nama, nip, departement,posisi;
    private int gaji;
    private int cuti=12;
    private boolean isMale;
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
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
    public void setGaji(int gaji,int tunjangan){

        this.gaji=gaji+tunjangan;
    }
    public void setGaji(int gaji,int tunjangan,int potongan){
        this.gaji=gaji+tunjangan;
    }
    public int getThr(){
        return this.getGaji();
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

    public void setNip(String nip) {
        if(this instanceof Pegawai && nip.charAt(0)=='P') {
            this.nip = nip;
        }
        else if(this instanceof Salesman && nip.charAt(0)=='S'){
            this.nip = nip;
        }
        else if(this instanceof Manager && nip.charAt(0)=='M'){
            this.nip = nip;
        }
        else{
            System.out.println("Gagal");
        }
    }
    public void setNip(int urutan){
        this.nip="P"+urutan;
    }
}
