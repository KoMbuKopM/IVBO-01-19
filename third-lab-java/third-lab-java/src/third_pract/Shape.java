package third_pract;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color = "red";
        this.filled = false;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

}
