public class custom_exception {
    public double division(double a, double b) {
        if (b == 0) {
            throw new java.lang.ArithmeticException("Divide By Zero is not acceptable");
        } else {
            double d = a / b;
            return d;
        }
    }

    public static void main(String[] args) {
        custom_exception div = new custom_exception();
        double x = div.division(5, 0);
        System.out.println(x);

    }
}
