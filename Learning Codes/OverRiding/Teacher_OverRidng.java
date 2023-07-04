
public class Teacher_OverRidng {
    public static void main(String[] args) {
        Teacher Sakib = new Teacher();
        Teacher Tamim = new Teacher("Tamim", "Male");
        Tamim.displayTeacher();
        Teacher Mushi = new Teacher("Mushi", "Male", 013456456456);
        Mushi.displayTeacher();
    }
}
