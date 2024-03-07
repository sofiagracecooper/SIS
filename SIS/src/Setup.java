import java.util.ArrayList;

public class Setup {
	//new ArrayList<Student> studentList=new ArrayList<Student> studentList();
private String firstName;
private String lastName;
private double gpa;
private ArrayList<Course> courses;
private int period;
private String className;
private String letterGrade;


public Student(String firstName, String lastName, double gpa, ArrayList<Course> courses) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.courses = courses;
}
public Course(int period, String className, String letterGrade)
{
this.period=period;
this.className=className;
this.letterGrade=letterGrade;
}

public ArrayList<Course> getCourses() {
	//I think this needs to be changed to return the right objects. 
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

public double calculateGPA()
{
	
}
}
