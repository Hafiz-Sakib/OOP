// import java.util.InputMismatchException;

public class custom_exception01 {
    public double div(int a, int b) throws ArithmeticException {
        double d;
        if (b < 0) {
            throw new ArithmeticException();
        } else {
            d = (double) a / b;
            return d;
        }
    }

    public static void main(String[] args) {
        custom_exception01 division = new custom_exception01();
        /*
         * try
         * {
         * double x = division.div(-1, 2);
         * System.out.println(x);
         * }
         * catch (ArithmeticException)
         * {
         * System.out.println(err);
         * }
         */
        double x = division.div(10, 0);
        System.out.println(x);
    }
}
