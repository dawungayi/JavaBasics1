import java.util.Scanner;

public class recap {

    public static void main(String[] args) {
        int i = 3;
        System.out.println("i is " + i);
        int [] arrVals = new int [] {1,2,3,4,5,6};
        for(i=0; i<arrVals.length; i++) {
            System.out.print( arrVals[i] + ", " );
        }

        Scanner userInp = new Scanner(System.in);
        System.out.print("\nPlease Enter a number: ");
        int val = userInp.nextInt();

        while(val != 99) {
        if (val < 8)
            System.out.println("I am less than 8");
        else
            System.out.println("I am more than or equal to 8");

        System.out.print("Please Enter a number: ");
        val = userInp.nextInt();
        }
        System.out.println("sum Function does: " + sum(arrVals));

        // Factorial
        System.out.print("Factorial of: ");
        int number = userInp.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorial(number));

        // Fibonacci
        System.out.print("Fibonacci index you want to know: ");
        int index = userInp.nextInt();
        System.out.println("The Fibonacci number at index " + index + " is: " + Fibonacci(index));


    } //end of main

    private static int sum(int [] myArray) {
        int sum = 0;
        for(int i=0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        return sum;
    }

    private static int factorial(int num) {
        if (num < 0)
            return 0;
        else if (num == 0 || num ==1)
            return 1;
        else
            return num * factorial(num-1);

    }

//    1,1,2,3,5,8,13,21,..
    private static int Fibonacci(int num) {
        if (num <= 0)
            return 0;
        else if (num == 1 || num == 2) {
            return 1;
        }
        else return Fibonacci(num-1) + Fibonacci(num-2);

    }

}

