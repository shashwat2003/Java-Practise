
// Check if a number is palindrome or not
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        int x2 = x, d, x3 = 0;
        while (x2 > 0) {
            d = x2 % 10;
            x3 = x3 * 10 + d;
            x2 /= 10;
        }
        if (x3 == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(isPalindrome(x));
        in.close();
    }
}