// Question: Given a positive integer, check if the number's prime factors are only
// 2,3, or/and 5
// Input: 8
// Output: true
// Input: 70
// Output: false

import java.util.Scanner;

public class Question1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number >> ");
        int a = sc.nextInt();
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                if ((i != 2 && i != 3 && i != 5) && isPrime(i)) {
                    System.out.println(false);
                    sc.close();
                    return;
                }
            }
        }
        sc.close();
    }

    public static boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}