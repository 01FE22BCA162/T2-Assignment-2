/**
 * The above Java class prompts the user to enter the name and date of birth of a student, and then
 * calculates and prints the age of the student.
 */
import java.time.LocalDate;  
import java.time.Period;  
import java.util.Scanner;  
public class Student_DOB  
{  
public static void main(String args[])   
{  
// This code is prompting the user to enter the name of the student and then reading the input from the
// user.
System.err.println("Enter the name of the student:");
Scanner sc =new Scanner(System.in);
String str =sc.nextLine();
System.out.println("Name of the student:"+str);

System.out.print("Enter date of birth in YYYY-MM-DD format: ");  
Scanner scanner = new Scanner(System.in);  
//reads the date of birth from the user  
String input = scanner.nextLine();  
scanner.close();  
//the parse() method obtains an instance of LocalDate from a text string such as 1992-08-11  
LocalDate dob = LocalDate.parse(input);  
//prints the age  
System.out.println("Age of the student is: " + calculateAge(dob));  
}  
//the method calculates the age  
public static int calculateAge(LocalDate dob)   
{  
//creating an instance of the LocalDate class and invoking the now() method      
//now() method obtains the current date from the system clock in the default time zone      
LocalDate curDate = LocalDate.now();  
//calculates the amount of time between two dates and returns the years  
if ((dob != null) && (curDate != null))   
{  
return Period.between(dob, curDate).getYears();  
}  
else  
{  
return 0;  
}  
}  
}  