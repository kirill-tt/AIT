package practice.hw;

import java.util.Objects;

public class Athlete {
    String lastName;
    String firstName;
    int registrationNumber;
    String club;
    double resultInSeconds;

    public Athlete(String lastName, String firstName, int registrationNumber, String club, double resultInSeconds) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.registrationNumber = registrationNumber;
        this.club = club;
        this.resultInSeconds = resultInSeconds;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Athlete athlete)) return false;
        return Double.compare( resultInSeconds, athlete.resultInSeconds )== 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash( resultInSeconds );
    }

    @Override
    public String toString() {
        return "Athlete :" +
                "LastName : " + lastName + '\'' +
                "| firstName : " + firstName + '\'' +
                "| registrationNumber : " + registrationNumber +
                "| club : " + club + '\'' +
                "| resultInSeconds = " + resultInSeconds ;
    }
}
