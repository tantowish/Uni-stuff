package Studen;

public class regStudent extends Student{
    public void registrasi(){
        super.setKelas("REG-1");
    }
    public String gradeIPK(){
        if(super.getIpk()==4){
            return "Istimewa";
        }
        else if(super.getIpk()<4 && super.getIpk()>3) {
            return "Baik";
        }
        else if(super.getIpk()>2 && super.getIpk()<=3){
            return "Cukup";
        }
        else{
            return "Gagal";
        }
    }
}
