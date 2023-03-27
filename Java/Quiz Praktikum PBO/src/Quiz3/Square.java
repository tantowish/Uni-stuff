package Quiz3;

public class Square extends Rectangle{
    public Square(){
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(color,filled,side,side);
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide(){
        return super.getLength();
    }

//  getArea() dan getPerimeter() tidak perlu di override karena
//  rumus keliling dan luas dari persegi panjang dan persegi
//  sama saja, maka kita tidak perlu mengubah atau meng-override method tersebut.
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square dengan side="+super.getLength()+ " merupakan subclass dari "+super.toString();
    }
}
