package third_pract;

public class Square extends Rectangle {
    protected double side;

    Square(){
        super(6, 6);
    }

    Square(double side){
        super(side, side);
    }

    Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this. filled = filled;
    }

    public double getSide(){ return this.side; }

    public void setSide(double side) { this.side = side; }

    public void setWidth (double side){ this.width = side; }

    public void setLength (double side){ this.length = side; }
}
