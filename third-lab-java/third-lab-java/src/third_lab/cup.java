package third_lab;

public class cup extends Dish{
    protected boolean handle;
    protected double vol;

    cup(){
        super("plastic", "round", false);
        this.handle = true;
        this.vol = 0.3;
    }

    public cup(String material, String form, boolean frosted, boolean handle,double vol){
        this.material = material;
        this.form = form;
        this.frosted = frosted;
        this.handle = handle;
        this.vol = vol;
    }

    public double volume(){
        return this.vol;
    }
}
