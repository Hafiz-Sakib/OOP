import java.util.Scanner;

public class mathodOverloading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        test s = new test(a, b);
        s.area();
        s.area(5);
        s.area(6, 7);
        sc.close();
    }
}

class test {
    int a;
    int b;

    test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void area() {
        System.out.println(this.a + this.b);
    }

    void area(int c) {
        System.out.println(this.a + this.b + c);
    }

    void area(int c, int d) {
        System.out.println(this.a + this.b + c + d);
    }
}