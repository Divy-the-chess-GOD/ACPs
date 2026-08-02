class Student {

    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void showDetails() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println("-------------------------");
    }
}

public class StudentRegister {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Aarav", 99);
        Student student2 = new Student(2, "Vivaan", 98);
        Student student3 = new Student(3, "Aditya", 97);
        Student student4 = new Student(4, "Krishna", 96);
        Student student5 = new Student(5, "Ishaan", 95);
        Student student6 = new Student(6, "Aryan", 94);
        Student student7 = new Student(7, "Rohan", 93);
        Student student8 = new Student(8, "Kabir", 92);
        Student student9 = new Student(9, "Rahul", 91);
        Student student10 = new Student(10, "Sohan", 90);

        student1.showDetails();
        student2.showDetails();
        student3.showDetails();
        student4.showDetails();
        student5.showDetails();
        student6.showDetails();
        student7.showDetails();
        student8.showDetails();
        student9.showDetails();
        student10.showDetails();
    }
}
