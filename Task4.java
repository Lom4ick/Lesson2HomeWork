package com.groupqa1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.err.println("This program calculates the deposit income! Thank you for using!");

        System.out.print("Enter Deposit Amount ($$) =");
        Scanner scannerDep = new Scanner(System.in);
        String depAmountString = scannerDep.nextLine();

        System.out.print("Enter percent rate (%%) =");
        Scanner scannerPerc = new Scanner(System.in);
        String percAmountString = scannerPerc.nextLine();

        System.out.print("Enter deposit period (months) =");
        Scanner scannerMonth = new Scanner(System.in);
        String monthAmountString = scannerMonth.nextLine();

        System.out.print("Enter days number in year (365/366) =");
        Scanner scannerYear = new Scanner(System.in);
        String yearString = scannerYear.nextLine();


        double depAmount = Double.parseDouble(depAmountString);
        double percAmount = Double.parseDouble(percAmountString);
        int year = Integer.parseInt(yearString);
        int monthAmount = Integer.parseInt(monthAmountString);
        int days =monthAmount*30;

        double profit = (depAmount * percAmount * days)/(year*100);
        DecimalFormat decProfit = new DecimalFormat("#.##");
        System.err.println("YOUR DEPOSIT PROFIT,$$:   "+ decProfit.format(profit));
    }
}
