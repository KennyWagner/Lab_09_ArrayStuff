package com.company;

import static com.company.SafeInput.getRangedInt;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean appeared = false;
        int total = 0;
        int count = 0;
        int minimum = 100;
        int maximum = 0;
        int[] datapoints = new int[100];
        for (int i = 0; i <= 99; i++)
        {
            datapoints[i] = rnd.nextInt(1,101);
            System.out.print(datapoints[i] + " | ");
            total += datapoints[i];
        }

        System.out.println();
        System.out.println("The sum of all numbers in the array is : " + total);
        System.out.println("The average of all numbers is: " + getAverage(datapoints));


        int chosen = getRangedInt(in,"Give me a number", 1,100);
        for (int i = 0; i <= 99; i++)
        {
         if (datapoints[i] == chosen)
         {
             count++;
         }
        }
        System.out.println("Your number (" + chosen + ") appeared " + count + " times.");

         chosen = getRangedInt(in,"Give me a number", 1,100);

             for (int i = 0; i <= 99; i++)
             {
                 if (datapoints[i] == chosen)
                 {
                     System.out.println("Your number (" + chosen + ") appears at index[" + i + "]");
                     appeared = true;
                     break;
                 }
                 if (datapoints[i] > maximum)
                 {
                    maximum = datapoints[i];
                 }
                 if (datapoints[i] < minimum)
                 {
                     minimum = datapoints[i];
                 }
             }
             if (!appeared)
             {
                 System.out.println("Your number (" + chosen + ") does not appear in the array.");
             }

        System.out.println();
        System.out.println("The maximum of the array is (" + maximum + ")");
        System.out.println("The minimum of the array is (" + minimum + ")");


    }

    public static double getAverage(int values[])
    {
        int total = 0;

        for (int i = 0; i <= 99; i++)
        {
            total += values[i];
        }
         return (total /100);
    }

}
