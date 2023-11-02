package practice.HWStudent.model;

public class StudentAppl {
    public static void main(String[] args) {
        Student student1 = new Student( 1, "Alex", "Smith ", 2004, "Development engineer" );
        Student student2 = new Student( 2,"Max "  , "Brown ", 2005,"Software developer" );
        Student student3 = new Student( 3, "Emma", "Palmer",2007,"Software tester" );

        student1.display();
        student2.display();
        student3.display();

        student1.entranceExam();
        student1.study();
        student1.homework();
        student1.consultation();
        student1.vacation();
        student1.graduateWork();
        student1.celebrate();
    }
}
