package practice.student;

public class Student {
    //поля
private int id;
    private String firstName;
    private String sekondName;
    private int [] marks;

    public Student(int id, String firstName, String sekondName, int[] marks) {
        this.id = id;
        this.firstName = firstName;
        this.sekondName = sekondName;
        this.marks = marks;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSekondName() {
        return sekondName;
    }

    public void setSekondName(String sekondName) {
        this.sekondName = sekondName;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Student student = (Student) object;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
    // метод который считает средний бал
    public double averageMark (int[] marks){
        // сложить все оценки
        int sum = 0;// создали переменную для накопления
        for (int i = 0; i < marks.length; i++) {
            sum += marks [i];// ili sum =  sum + marks[i];

        }
        return sum/(double)marks.length;


        // разделить на их количество

    }
}
