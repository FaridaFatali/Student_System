package Student;

import java.time.LocalDate;

public class PhdStudent extends GraduateStudent {
    protected boolean qualifyingExamTaken;

    public PhdStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
        super(no, nameSurname, year, dateOfBirth, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        System.out.println("The student registered as a Ph.D. student!");
    }

    @Override
    public void writeThesis() {
        super.writeThesis();
        meetWithAdvisor();
    }

    @Override
    public void meetWithAdvisor() {
        super.meetWithAdvisor();
    }

    @Override
    public String toString() {
        return super.toString() + "\nQualifying exam taken - " + qualifyingExamTaken;
    }

    @Override
    public String toStringRegister() {
        return super.toStringRegister();
    }
}
