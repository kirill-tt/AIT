package practice.HWStudent.model;

public class Student {
    private int id; // идентификатор
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String specialization;

    // конструктор класса


    public Student(int id, String firstName, String lastName, int yearOfBirth, String specialization) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.specialization = specialization;
    }

    //Getter and Setter
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    //Print
    public void display() {
        System.out.println( "ID:" + id + ", first name: " + firstName + " ,last name: "
                + lastName + " ,Year of birth: " + yearOfBirth + " Specialization: " + specialization );
    }

    public void entranceExam() {
        System.out.println( "Student takes the entrance exam! " );
    }

    public void study() {
        System.out.println( "Student studying." );
    }

    public void homework() {
        System.out.println( "Student doing homework." );
    }

    public void consultation() {
        System.out.println( "Student goes for consultation." );
    }

    public void vacation() {
        System.out.println( "Student takes vacation." );
    }

    public void graduateWork() {
        System.out.println( "Student defends his diploma!!!!" );
    }

    public void celebrate() {
        System.out.println( "Student celebrating graduation!!!!!!!!!" );

    }
}
