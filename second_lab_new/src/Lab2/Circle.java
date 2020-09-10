package Lab2;

public class Circle {
    private int rad;
    private int diam;
    private double AreaOfCircle;

    public Circle(int rad) {
        setRad(rad);
        this.diam = rad * 2;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad){
        this.rad = rad;
    }

    public int getDiam() {
        return diam;
    }

    public double Area(){
        this.AreaOfCircle = (double) Math.round(Math.PI * Math.pow(this.rad, 2)*1000)/1000;
        return AreaOfCircle;
    }
}
