import java.util.ArrayList;

public class Setup {
private String firstName;
private String lastName;
private double gpa;
private ArrayList<Course> courses;

public Student(String firstName, String lastName, double gpa, ArrayList<Course> courses) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.courses = courses;
}
public ArrayList<Course> getCourses() {
    return courses;
}
public String firstName getfirstName()
{
	return firstName;
}
public String lastName getlastName()
{
	return lastName;
}
public double gpa getgpa()
{
	return gpa;
}
}
