public class Student {
    public static void main(String[] argument) {
        // Scanner sc = new Scanner(System.in);
        student sakib = new student(75, "Sakib Al hasan", "3rd", 4);
        sakib.print();
    }
}

class student {
    int id;
    String name;
    String semester;
    float cgpa;

    student(int id, String name, String semester, float cgpa) {
        // Constructor
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.cgpa = cgpa;
    }

    void print() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(semester);
        System.out.println(cgpa);
    }
}