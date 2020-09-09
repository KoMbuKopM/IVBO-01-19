package ru.mirea.lab1;

public class FirstEx {
    public static void main (String[] args){
        int count = 0;
        int[] array = new int[]{10, 12, 15, 12, 0, -5, 9, 7, 56, -6};
        for (int i = 0; i<10; i++){
            count = count + array[i];
        }
        System.out.println(count);
        count = 0;

        int i = 0;
        while (i != 10){
            count = count + array[i];
            i = i + 1;
        }
        System.out.println(count);
        count = 0;

        i = 0;
        do{
            count = count + array[i];
            i = i + 1;
        }while(i < 10);
        System.out.println(count);

    }
}
