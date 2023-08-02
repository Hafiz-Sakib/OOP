import java.util.Scanner;

public class performance2 {
    void checkCourse(int number) throws myException {
        if (number <= 20) {
            throw new myException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Final Number : ");
        performance2 check = new performance2();
        int n = sc.nextInt();
        try {
            check.checkCourse(n);
            System.out.println("You Can take retake this course !!");
        } catch (myException err) {
            System.err.println("Sorry ! You must take recourse !!");
        }
        sc.close();
    }
}
