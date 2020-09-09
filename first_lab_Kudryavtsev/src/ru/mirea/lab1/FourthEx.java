package ru.mirea.lab1;

public class FourthEx {
    public static void main (String[] args){
        int[] array = new int[10];
        for (int i = 0; i<10; i++){
            array[i] = (int)(Math.random()*200);
            System.out.println(array[i]);
        }

        System.out.println("-------------");

        for (int i = 0; i<10;i++){
            for(int j = 0; j<9; j++){
                if (array[j] > array[j+1]){
                    int gg = array[j+1];
                    array[j+1] = array[j];
                    array[j] = gg;
                }
            }
        }
        for (int i = 0; i<10; i++){
            System.out.println(array[i]);
        }
    }
}
