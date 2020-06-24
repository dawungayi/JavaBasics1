import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LearnScanner {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = input.next();   // this is how you enter a string with no whitespace
            // String name = input.nextLine();   // this is how you enter a string with whitespaces
            System.out.println("Welcome,  " + name);

            System.out.println("\nEnter your age in 2019");
            int age = input.nextInt();  // This is how you enter an int
            System.out.println("Your age in 2029 will be " + (age+10) );

            System.out.println("\nEnter your best speed now: ");
            double speed = input.nextDouble();
            System.out.println("Your Speed after basic training will be: " + (speed*2.5) );

        }

}
