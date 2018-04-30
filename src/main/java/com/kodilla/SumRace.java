package com.kodilla;
import java.util.*;

public class SumRace {
    public static void main (String[] args) throws java.lang.Exception {

    int sumA = 1000;
    int sumB = 0;
    int tryCounter = 0;
    Random randomGenerator = new Random();
    int a = randomGenerator.nextInt(10);
    int b = randomGenerator.nextInt(50);

    while (sumA > sumB) {
        tryCounter++;
        sumA = sumA + a;
        sumB = sumB + b;
        System.out.println("Sum A equals " + sumA + ", sum B equals " + sumB + "\n" + "Attempt number: " + tryCounter + "\n");
    }
    System.out.println("Sum A equals " + sumA + ", sum B equals " + sumB + "\n" +
            "Sum A is now less than Sum B \n");
}
}