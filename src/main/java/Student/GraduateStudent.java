package Student;

import java.time.LocalDate;

public class GraduateStudent extends Student {
    protected String advisor;
    protected String thesis;

    public GraduateStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major, String advisor, String thesis) {
        super(no, nameSurname, year, dateOfBirth, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study() {
        System.out.println("The student is studying!");
    }

    @Override
    public void register() {
        System.out.println("The student is registered as a Graduate student!");
    }

    public void writeThesis() {
        System.out.println("The student wrote the thesis.");
        meetWithAdvisor();
    }

    public void meetWithAdvisor() {
        System.out.println("The student met with the advisor.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nThesis - " + thesis +
                "\nAdvisor - " + advisor;
    }

    @Override
    public String toStringRegister() {
        return super.toStringRegister();
    }
}
