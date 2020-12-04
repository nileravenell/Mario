package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int number;
        do {
            System.out.print("Size: ");
            number = keyboard.nextInt();
        }
        while (number < 1 || number > 8);{
            for (int x= 0; x<= number; x++){
            for (int y=1; y<=number-x; y++){
            System.out.print(" ");
            }
            for (int z=0;z<=x;z++){
            System.out.print("#");
            }
            System.out.println(" ");
            }
        }
    }
}
