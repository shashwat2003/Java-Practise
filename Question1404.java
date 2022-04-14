import java.util.Scanner;

public class Question1404 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input >> ");
        String a = in.nextLine();
        in.close();
        int count, i = 0;
        String output = "";
        while (i < a.length()) {
            count = 1;
            while (i + 1 < a.length() && a.charAt(i) == a.charAt(i + 1)) {
                count++;
                i++;
            }
            output += a.charAt(i) + Integer.toString(count);
            i++;
        }
        System.out.println(output);
    }
}
