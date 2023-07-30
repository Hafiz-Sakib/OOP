import java.util.InputMismatchException;

public class custom_exception01 {
    public double div(int a, int b) throws ArithmeticException, InputMismatchException {
        double d;
        if (a < 0) {
            throw new java.util.InputMismatchException("Value Can't be less than 0");
        } else {
            d = (double) a / b;
            return d;
        }
    }

    public static void main(String[] args) {
        custom_exception01 divison = new custom_exception01();
        /*
         * try
         * {
         * double x = divison.div(-1, 2);
         * System.out.println(x);
         * }
         * catch (ArithmeticException | InputMismatchException err)
         * {
         * System.out.println(err);
         * }
         */
        double x = divison.div(1, 0);
        System.out.println(x);
    }
}
