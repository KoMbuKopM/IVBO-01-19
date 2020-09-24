package third_lab;

public class test{
    public static void main(String[] args) {
        plate first = new plate("plastic", "round", true, true, 1.0);
        System.out.println("Материал тарелки: " + first.getMaterial());
        System.out.println("Тарелка гладкая: " + first.isFrosted());
        System.out.println();
        cup second = new cup();
        System.out.println("Материал чашки: " + second.getMaterial());
        System.out.println("Форма чашки: " + second.getForm());
        System.out.println("Объём чашки в литрах: " + second.volume());
    }
}
