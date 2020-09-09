package ru.mirea.lab1;

import java.util.Scanner;

public class FifthEx {
    public static int factorial(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i<=x; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main (String[] args){
        System.out.println(factorial());
    }
}
