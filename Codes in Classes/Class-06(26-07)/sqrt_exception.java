import java.util.Scanner;
import java.lang.Math;

public class sqrt_exception {
    public static void main(String[] args) {
        int a;
        double d = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter One Integer Values");
        a = sc.nextInt();
        if (a < 0) {
            throw new java.util.InputMismatchException("Cannot be a negative Value");
        } else {
            d = Math.sqrt(a);
            System.out.println("Squre Root of Your Number is = : " + d);
        }
        sc.close();
    }
}
