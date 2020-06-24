public class Recursive {
    public static void main (String[] args) {
        int x = 4;
        //long y = factorial(x);
        //System.out.println("The factorial of " + x + " is " + y);

       System.out.println("Fibonacci elt # " + x + " is " + MyFibonacci(x));

       //int sum = summing(x);
        //System.out.println("Sum of first NN = " + x + x + " is " + sum);

    }

    public static long factorial(int x) {
        if(x == 1) return 1;

        else
            return x * factorial(x-1);
    }

    public static int MyFibonacci(int n) {
        if (n == 1) return 0;
        else if (n == 2 ) return 1;

        else
            return (MyFibonacci(n-1) + MyFibonacci(n-2));

    }

    public static int summing(int n) {
        int i;
        int[] array;
        array = new int[] {11, 22, 33, 44, 55, 66, 77, 88, 99};

        if(n == 1) return array[0];
        else
            return array[n-1] + summing(n-1);

    }

}
