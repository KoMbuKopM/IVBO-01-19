package third_lab;

abstract class Dish {
    protected String material;
    protected String form;
    protected boolean frosted;

    public Dish()
    {
        this.material = "plastic";
        this.form = "round";
        this.frosted = false;
    }

    public Dish(String material, String form, boolean frosted){
        this.material = material;
        this.form = form;
        this.frosted = frosted;
    }

    public void setFrosted(boolean frosted) {
        this.frosted = frosted;
    }

    public boolean isFrosted() {
        return frosted;
    }

    public String getForm() {
        return form;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setForm(String form) {
        this.form = form;
    }

    abstract double volume();
}
