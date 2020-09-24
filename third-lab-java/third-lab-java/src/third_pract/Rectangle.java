package third_pract;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle(){
        super("red", false);
        this.length = 5;
        this.width = 3;
    }

    Rectangle(double width, double length){
        super("red", false);
        this.length = length;
        this.width = width;
    }

    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.color = color;
        this.filled = filled;
        this.length = length;
    }

    public double getWidth() { return this.width; }

    public void setWidth(double width) { this.width = width; }

    public double getLength() { return this.length; }

    public void setLength(double length) { this.length = length; }

    public double getArea(){ return this.width * this.length; }

    public double getPerimeter(){ return this.width + this.length; }
}
