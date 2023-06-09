import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Enter The Number You Want to Find");
        int q = sc.nextInt();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == q) {
                System.out.println("Number Found");
                break;
            } else if (a[mid] < q) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (l > r) {
            System.out.println("Number Not Found");
        }
        sc.close();
    }
}
