class a {
    private final void show() {
        System.out.println("show");
    }
}

class b extends a {
    public void show() {
        System.out.println("newShow");
    }
}

public class seven_1 {
    public static void main(String[] args) {
        new b().show();
    }
}
