import java.util.Scanner;

public class Question0105 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        for (int l = ("" + n).length(); l > 1;) {
            int sum = 0;
            while (l > 0) {
                sum = sum + (int) (n % Math.pow(10, l));
                l--;
            }
        }
        System.out.println(n);
    }
}