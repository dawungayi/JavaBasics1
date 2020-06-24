import java.text.*;

public class MathClass {
    //private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        double x = 24;
        double y = Math.sqrt(x);
        System.out.println(y);
        //System.out.println(String.format("%.2f", y));
        //DecimalFormat df = new DecimalFormat("#.##");
        // Change to 2 dp
        int temp = (int)(y*100.0);

        double yy = ((double)temp)/100.0;
        System.out.print(yy);


    }
}
