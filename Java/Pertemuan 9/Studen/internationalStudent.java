package Studen;

public class internationalStudent extends regStudent{
    @Override
    public String gradeIPK() {
        if (super.getIpk()==4){
            return "High Distinction";
        }
        else if(super.getIpk()<4 && super.getIpk()>3){
            return "Distintion";
        }
        else if(super.getIpk()>2.5 && super.getIpk()<=3){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }
    @Override
    public void registrasi(){
        this.setKelas("INT-1");
    }
}
