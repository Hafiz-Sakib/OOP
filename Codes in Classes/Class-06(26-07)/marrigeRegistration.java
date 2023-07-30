import java.util.Scanner;

public class marrigeRegistration {
    void checkEligibility(int men, int women) throws MyCustomException {
        if (men < 21 || women < 18) {
            throw new MyCustomException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int men, women;
        men = sc.nextInt();
        women = sc.nextInt();
        marrigeRegistration rg = new marrigeRegistration();
        try {
            rg.checkEligibility(men, women);
        } catch (MyCustomException err) {
            System.out.println("Don't Marry With a Child!!");
        }
    }
}