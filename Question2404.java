
// Question: Check if a given array is a mountain.(increasing first then decreasing)
// Input: [1,2,3,4,5,3,2]: true [1,4,2,3]
import java.util.Scanner;

public class Question2404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        if (n < 3) {
            System.out.println(false);
        } else {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(isMountain(arr));
        }

        sc.close();
    }

    public static boolean isMountain(int arr[]) {
        int max = arr[0], maxIn = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIn = i;
            }
        }
        if (maxIn == 0 || maxIn == (arr.length - 1)) {
            return false;
        }

        for (int i = 0; i < maxIn; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }

        for (int i = maxIn; i < (arr.length - 1); i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}