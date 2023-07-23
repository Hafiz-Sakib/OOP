import java.util.Scanner;

public class Exception_Handling01 {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Integer Values");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            double d = (double) a / b;
            System.out.println("Division of Your Numbers is = " + d);
        } catch (ArithmeticException err) {
            System.out.println(err);
        }
        sc.close();
    }
}