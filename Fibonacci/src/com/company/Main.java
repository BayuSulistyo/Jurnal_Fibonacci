package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner show = new Scanner(System.in);
        System.out.print("===Deret Fibonacci===\n");
        System.out.print("Input : ");
        int a = show.nextInt();
        fibonacci(a);
    }
    public static void fibonacci(int a){
        long x[] = new long[a];
        x[0] = 1;
        x[1] = 1;
        long sum=0;
        for(int i = 2; i < a; i++) {
            x[i] = x[i-1] + x[i-2];
        }
        for (int i = 0; i < a; i++) {
            sum = sum + x[i];
        }
        System.out.println(sum);
    }
}
