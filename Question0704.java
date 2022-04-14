import java.util.Scanner;
import java.lang.Math;

public class Question0704 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter the value of Y: ");
        int y = in.nextInt();

        int x = in.nextInt();
        double n = (Math.log(y) / Math.log(x));

        if (n % 1 == 0) {
            System.out.println("Yes, " + y + " can be expressed as " + x + " to the power of " + (int) n + "!");
        } else {
            System.out.println("No, " + y + " cannot be expressed as the power of " + x + "!");
        }

        in.close();
    }
}
