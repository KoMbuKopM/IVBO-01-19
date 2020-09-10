package Lab2;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        Circle first = new Circle(i);
        System.out.println(first.getRad());
        System.out.println(first.getDiam());
        System.out.println(first.Area());

    }
}
