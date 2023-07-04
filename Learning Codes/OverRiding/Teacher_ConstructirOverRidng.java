
public class Teacher_ConstructirOverRidng {
    public static void main(String[] args) {
        Teacher_Constructor Sakib = new Teacher_Constructor();
        Teacher_Constructor Tamim = new Teacher_Constructor("Tamim", "Male");
        Tamim.displayTeacher();
        Teacher_Constructor Mushi = new Teacher_Constructor("Mushi", "Male", 013456456456);
        Mushi.displayTeacher();
    }
}
