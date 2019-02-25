package com.groupqa1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.err.println("INPUT DATA");
        System.out.println("value1=");
        Scanner value1Scanner = new Scanner(System.in);
        String value1string = value1Scanner.nextLine();
        System.out.println("value2=");
        Scanner value2Scanner = new Scanner(System.in);
        String value2string = value2Scanner.nextLine();

        int value1 = Integer.parseInt(value1string);
        int value2 = Integer.parseInt(value2string);

        value1=value1+value2-(value2=value1);

      System.err.println("RESULTING DATA");
      System.out.println("value1="+value1);
      System.out.println("value2="+value2);
    }
}
