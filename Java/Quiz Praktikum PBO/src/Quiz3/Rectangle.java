package Quiz3;

public class Rectangle extends Shape{
    private double width,length;

    public Rectangle(){
        this.width=1;
        this.length=1;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return (2*this.width)+(2*this.length);
    }

    @Override
    public String toString() {
        return "Rectangle dengan width="+this.width+" dan length="+this.length+", merupakan subclass dari "+super.toString();
    }
}
