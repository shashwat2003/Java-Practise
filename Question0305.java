import java.util.Scanner;

public class Question0305 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        // int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        // int j = 0, k = 0;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] % 2 == 0) {
        // arr2[j] = arr[i];
        // j++;
        // } else {
        // arr2[n - 1 - k] = arr[i];
        // k++;
        // }
        // }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                for (int j = i; j < n; j++) {
                    if (arr[j] % 2 == 0) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }

            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
