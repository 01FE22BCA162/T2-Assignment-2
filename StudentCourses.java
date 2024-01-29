/**
 * The StudentCourses class stores course codes and marks obtained by a student and provides a method
 * to display the course names and marks.
 */
public class StudentCourses {

    private String[] courseCodes = { "C#.Net   /C Sharp","Software Testing", "Machine Learning", "DEVOPS       LAB", "Logical Reasoning" };
    private int[] marks = { 92, 98, 95, 91, 97 };

    public void displayStudentMarks() {
        System.out.println("Course names      \t\tMarks-Obtained");

        for (int i = 0; i < courseCodes.length; i++) {
                System.out.println(courseCodes[i] + "\t\t\t" + marks[i]);
        }
    }

}
