public class exception_handling_03 {
    public static void main(String[] args) {
        int a[] = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        try {
            for (int i = 0; i < 5; i++) {
                System.err.println(a[i]);
            }
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println(error);
        }
    }
}
