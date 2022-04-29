
// Question: User enters a number, create an array of that length and add elements such that sum of all elemets is zero

import java.util.Arrays;
import java.util.Scanner;

public class Question2904 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        int j = 0;

        for (int i = -n / 2; i <= n / 2; i++) {
            if (n % 2 == 0 && i == 0) {
                continue;
            }
            arr[j] = i;
            j++;
        }

        System.out.println(Arrays.toString(arr));

        in.close();
    }
}
