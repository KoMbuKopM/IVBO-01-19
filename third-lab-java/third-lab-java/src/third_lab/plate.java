package third_lab;

public class plate extends Dish {
    protected boolean deep;
    protected double vol;

    plate(){
        super("plastic", "round", false);
        this.deep = true;
        this.vol = 1.5;
    }

    public plate(String material, String form, boolean frosted, boolean deep, double vol){
        this.material = material;
        this.form = form;
        this.frosted = frosted;
        this.deep = deep;
    }

    public double volume(){
        return this.vol;
    }
}