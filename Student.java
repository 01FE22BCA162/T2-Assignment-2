/**
 * The Student class represents a student with a name and date of birth, and it includes methods to
 * display the student's name, age, and course marks.
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * The Student class represents a student with a name and date of birth, and provides methods to
 * display the student's name and calculate their age.
 */
public class Student extends StudentCourses {
    String name;
    String dob;

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age);
    }

    /**
     * The main function creates a Student object, sets its name, calls a method to display the name,
     * and then creates a StudentCourses object and calls a method to display the student's marks.
     */
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Shri Ram";
        s.displayName();
        s.displayAge("22-01-2023");
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.displayStudentMarks();
    }
}
