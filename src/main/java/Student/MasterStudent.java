package Student;

import java.time.LocalDate;

public class MasterStudent extends GraduateStudent {

    public MasterStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major, String advisor, String thesis) {
        super(no, nameSurname, year, dateOfBirth, major, advisor, thesis);
    }

    @Override
    public void study() {
        System.out.println("The student is studying!");
    }

    @Override
    public void register() {
        System.out.println("The student is registered as a Master student!");
    }

    @Override
    public void writeThesis() {
        System.out.println("The student wrote the thesis.");
        meetWithAdvisor();
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("The student met with the advisor.");
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
