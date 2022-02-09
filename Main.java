package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во шагов:");
        int i = in.nextInt();
        if(i < 0){
            System.out.println("Введите положительное число");
        }
        else {
        System.out.println("Введите x:");
        int x = in.nextInt();
        double S = 0;
        for(var j=0;j<=i;j++){

            double P =(Math.pow(x,2*j+1))/(2*j+1);
            S= S+P;
        }

        System.out.println("Oтвет: " + S);
        }
    }
}
