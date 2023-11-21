package practice.hw;

import java.util.Objects;
 // Fields
public class Athletes {
    String lastName;
    String firstName;
    int registrationNumber;
    String club;
    double resultInSeconds;
// Constructor
    public Athletes(String lastName, String firstName, int registrationNumber, String club, double resultInSeconds) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.registrationNumber = registrationNumber;
        this.club = club;
        this.resultInSeconds = resultInSeconds;
    }
// Getter and Setter
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public double getResultInSeconds() {
        return resultInSeconds;
    }

    public void setResultInSeconds(double resultInSeconds) {
        this.resultInSeconds = resultInSeconds;
    }
//Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Athletes athletes)) return false;
        return Double.compare( resultInSeconds, athletes.resultInSeconds )== 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash( resultInSeconds );
    }
// toString
    @Override
    public String toString() {
        return "Athlete | " +
                "LastName: " + lastName +
                "| FirstName: " + firstName +
                "| RegistrationNumber № " + registrationNumber +
                "| Club: " + club +
                "| ResultInSeconds = " + resultInSeconds ;
    }
}
