import java.util.Scanner;

public class summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum s = new sum(a, b);
        s.print();
        sc.close();
    }
}

class sum {
    int a;
    int b;

    sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void print() {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}