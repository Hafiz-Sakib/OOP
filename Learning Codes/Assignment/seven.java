class Clidder {
    private final void flipper() {
        System.out.println("Clidder");
    }
}

public class seven extends Clidder {
    public final void flipper() {
        System.out.println("Clidlet");
    }

    public static void main(String[] args) {
        new seven().flipper();
    }
}
