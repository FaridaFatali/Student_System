package Student;

import java.time.LocalDate;

public abstract class Student {
    protected int no;
    protected String nameSurname;
    protected int year;
    protected LocalDate dateOfBirth;
    protected String major;

    public Student(int no, String nameSurname, int year, LocalDate dateOfBirth, String major) {
        this.no = no;
        this.nameSurname = nameSurname;
        this.year = year;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
    }

    public abstract void study();

    public abstract void register();

    @Override
    public String toString() {
        return "STUDENT INFO: " +
                "\n-----------" +
                "\nNo - " + no +
                "\nName and surname - " + nameSurname +
                "\nDate Of Birth - " + dateOfBirth +
                "\nMajor - " + major +
                "\nYear - " + year;
    }

    public String toStringRegister(){
        return "STUDENT INFO:" +
                "\n-------------" +
                "\nNo - " + no +
                "\nName and surname - " + nameSurname +
                "\nDate of birth - " + dateOfBirth +
                "\nMajor - " + major;
    }
}
