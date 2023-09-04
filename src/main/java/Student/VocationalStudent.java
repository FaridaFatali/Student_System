package Student;

import java.time.LocalDate;

public class VocationalStudent extends Student {
    public VocationalStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major) {
        super(no, nameSurname, year, dateOfBirth, major);
    }

    @Override
    public void study() {
        System.out.println("The student is studying!");
    }

    @Override
    public void register() {
        System.out.println("The student is registered as a Vocational student!");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toStringRegister() {
        return super.toStringRegister();
    }
}
