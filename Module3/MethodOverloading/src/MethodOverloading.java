import java.util.*;

public class MethodOverloading {
    public static void main(String[] args) {
        String s1 = "Hello";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter s2: ");
        String s2 = input.next();

        ConcatString(s1, s2);

    }

    public static void ConcatString(String s3) {
        System.out.println(s3);
    }

    public static void ConcatString(String s1, String s2) {

        String s3 = s1.concat(s2);
        ConcatString(s3);
    }
}


