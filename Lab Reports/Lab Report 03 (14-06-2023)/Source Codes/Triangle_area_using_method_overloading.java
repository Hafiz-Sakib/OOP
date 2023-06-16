import java.util.Scanner;

public class Triangle_area_using_method_overloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Area obj = new Area();
        obj.area(a);
        obj.area(a, b);
        sc.close();
    }
}

class Area {
    void area(int a) {
        System.out.println((Math.sqrt(3) / 4 * a * a));
    }

    void area(int b, int h) {
        System.out.println(0.5 * b * h);
    }
}