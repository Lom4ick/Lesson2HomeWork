package com.groupqa1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program converts LB to KG and grams.");
        System.out.print("Enter LB=");
        String lb = scanner.nextLine();
        double lbNew = Double.parseDouble(lb);
        double kgSum = lbNew*0.4536;
        int kgInt = (int)kgSum;
        double kgFract = (kgSum - kgInt)*1000;
        // System.out.println(kgInt);
        DecimalFormat kgFract1 = new DecimalFormat("#");
        System.err.print("KG:"+ kgInt + "  Grams:"+ kgFract1.format(kgFract) );


    }
}
