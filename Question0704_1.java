import java.util.Scanner;

public class Question0704_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter the value of X: ");
        int x = in.nextInt();

        System.out.println("Please Enter the value of Y: ");
        int y = in.nextInt();

        int c = 1, n = 0;

        if ((y == 1) && (x == 1)) {
            System.out.println("Yes, " + y + " can be expressed as " + x + " to the power of " + (int) n + "!");
        } else if ((x == 1)) {
            System.out.println("No, " + y + " cannot be expressed as the power of " + x + "!");
        } else {

            while (y > c) {
                c *= x;
                n++;
            }

            if (y == c) {
                System.out.println("Yes, " + y + " can be expressed as " + x + " to the power of " + (int) n + "!");
            } else {
                System.out.println("No, " + y + " cannot be expressed as the power of " + x + "!");
            }
            in.close();

        }
    }
}
