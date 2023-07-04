// Teacher Using Method OverRiding

public class Teacherr {

    String name, gender;
    int phn;

    void Teacher1() {
        System.out.println("No Information!");
    }

    void Teacher2(String n, String g) {
        name = n;
        gender = g;
    }

    void Teacher3(String n, String g, int p) {
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
