
public class test {
    static String s = "sakib";

    private test() {
        s += "sub ";
    }

    public static void main(String[] args) {
        new test();
        System.out.println(s);
    }

}
