package third_pract;

public class Circle extends Shape{
    protected double radius;

    Circle(){
        super("red", false);
        this.radius = 2;
    }

    Circle(double radius){
        super("red", false);
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * this.radius;
    }

}
