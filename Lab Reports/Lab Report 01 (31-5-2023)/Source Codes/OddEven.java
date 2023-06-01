import java.util.Scanner;

/**
 * Hafiz-Sakib
 * Id - 0222210005101118(3C)
 */
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i : a) {
            if (i % 2 == 0) {
                System.out.println(i + " = " + "Even Number");
            } else {
                System.out.println(i + " = " + "Odd Number");
            }
        }

        sc.close();
    }
}