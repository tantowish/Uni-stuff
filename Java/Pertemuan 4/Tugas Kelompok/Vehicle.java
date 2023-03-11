public class Vehicle {
    double fuelcap,mpg,passangers,price;
    String grade;
    public Vehicle(){
        this.passangers = 0;
        this.fuelcap = 0;
        this.mpg = 0;

    }
    public Vehicle(double passangers,double fuelcap, double mpg, double price){
        this.passangers = passangers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
        this.price = price;
    }
    public double getRange(){
        return fuelcap*mpg;
    }
    
    public void range(){
        System.out.println(fuelcap*mpg);
    }
    public String getGrade(){
        if(price/passangers>=1500 && mpg>20){
            this.grade="Supercar";
        }
        else{
            this.grade="Familycar";
        }
        return grade;
    }

    public String toString(){
        return "This car can carry "+ (int)this.passangers + " with a range of "+getRange()+" and graded as "+getGrade();
    }
}
