import java.util.Scanner;
import java.lang.Math;

public class performance1 {
    public static void main(String[] args) {
        int a;
        double d = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter One Integer Values");
        a = sc.nextInt();
        try {
            d = Math.sqrt(a);
            System.out.println("Squre Root of Your Number is = : " + d);
        } catch (ArithmeticException error) {
            System.out.println(error);
        }
        sc.close();

    }

}
