package Student;

import java.time.LocalDate;

public class UndergraduateStudent extends Student {
    protected String minor;

    public UndergraduateStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major, String minor) {
        super(no, nameSurname, year, dateOfBirth, major);
        this.minor = minor;
    }

    @Override
    public void study() {
        System.out.println("The student is studying!");
    }

    @Override
    public void register() {
        System.out.println("The student is registered as an Undergraduate student!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nMinor - " + minor;
    }

    @Override
    public String toStringRegister() {
        return super.toStringRegister();
    }
}
