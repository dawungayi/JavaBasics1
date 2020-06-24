import java.util.*;  // import scanner

public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        //int num = 6;
        if(num % 5 == 0 )
            System.out.println("TRUE");

        else
            System.out.println("FALSE");

        String name = input.next();
        if( name.startsWith("J"))
            System.out.println("Names is good");

    }

}