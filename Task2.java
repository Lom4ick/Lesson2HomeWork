package com.groupqa1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the number sequence:");
        Scanner in = new Scanner(System.in);
        String numSequenceString = in.nextLine();
        char[]numArray = numSequenceString.toCharArray();

        String num = "";

        System.out.println("Your number in mirror mode" );

        for(int i=numArray.length-1; i>=0; i--){
            num += numArray[i];
            System.out.printf("%s   ", numArray[i]);
        }
        int numMirrorSequence = Integer.parseInt(num);
        int numSequence = Integer.parseInt(numSequenceString);
        int result = numSequence - numMirrorSequence;
        System.err.println("The subtraction result:"+result);

        }
    }


