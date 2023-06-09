// Teacher Using Constructor OverRiding

public class Teacher {

    String name, gender;
    int phn;

    Teacher() {
        System.out.println("No Information!");
    }

    Teacher(String n, String g) {
        name = n;
        gender = g;
    }

    Teacher(String n, String g, int p) {
        name = n;
        gender = g;
        phn = p;
    }

    void displayTeacher() {
        System.out.println("Name :" + name);
        System.out.println("Gender :" + gender);
        System.out.println("Phone No : " + phn);
    }

    public static void main(String[] args) {
        Teacher Sakib = new Teacher();
        Teacher Tamim = new Teacher("Tamim", "Male");
        Tamim.displayTeacher();
        Teacher Mushi = new Teacher("Mushi", "Male", 013456456456);
        Mushi.displayTeacher();
    }
}
