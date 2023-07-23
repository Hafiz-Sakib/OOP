import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling02 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Integer Values");
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            double d = (double) a / b;
            System.out.println("Division of Your Numbers is = " + d);
        } catch (InputMismatchException err) {
            System.out.println(err);
            System.out.println("You Can't Divide a Number by String or Character");
        }
        sc.close();
    }
}
