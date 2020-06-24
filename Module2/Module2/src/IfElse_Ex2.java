

import java.util.Scanner;

public class IfElse_Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Exercise #1: Write a program to print the grade of a student based on
        // the user enter mark. Students with, 80 or higher gets A, 70 or higher
        // gets B, 60 or higher gets C, 40 or higher gets D, otherwise F.

        /*
        System.out.print("Print your exam score: ");
        int score = input.nextInt();

        if(score >= 80)
            System.out.println("Grade is A");

        else if(score >= 70)
            System.out.println("Grade is B");

        else if(score >= 60)
            System.out.println("Grade is C");

        else if(score >= 40)
            System.out.println("Grade is D");

        else
            System.out.println("Grade is F");

         */


        /*
        // Exercise #2: Write a program using a single if statement with AND (&&),
        // OR (||) and NOT (!) operators to check the given number is not divisible by
        // 2 or 3 and that the number is divisible by 5 and 10. If meets criteria print
        // “True” or else print “False”.

        int num = 0;
        while(num != 100) {
            System.out.print("What is the number: ");
            num = input.nextInt();
            if ( (num % 2 != 0 || num % 3 != 0) && (num % 10 == 0 || num %5 == 0) )
                System.out.println("TRUE");
            else
                System.out.println("FALSE");

         */


        // Exercise #3: Write a program to print how many digit’s the number is of as 2, 3-
        // or 4-digit number. Example 1:
        // Input: "232"
        // Output: "3-digit Number"

        int num = 0;
        while(num != 999) {
            System.out.print("What is the number: ");
            num = input.nextInt();
            if (num >= 1000 && num < 10000)
                System.out.println("4-digit number");
            else if (num >= 100 && num < 1000)
                System.out.println("3-digit number");
            else if (num >= 10 && num < 100)
                System.out.println("2-digit number");
            else
                System.out.println("Number is not eligible");
        }
    }

}
