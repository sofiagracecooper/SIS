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

private void calculateGPA()
{
	if (courses.isEmpty())
	{
		gpa=0.00;
	
	}
	private double convertGradeToNum(char letterGrade) {
	    if (grade == 'A') {
	        return 4.0;
	    } else if (letterGrade == 'A') {
	        return 4.0;
	    } else if (letterGrade == 'A-') {
	        return 3.7;
	    } else if (letterGrade == 'B+') {
	        return 3.3;
	    } else if (letterGrade == 'B') {
	        return 3.0;
	    } else if (letterGrade == 'B-') {
	        return 2.7;
	    } else if (letterGrade == 'C+') {
	        return 2.3;
	    } else if (letterGrade == 'C') {
	        return 2.0;
	    } else if (letterGrade == 'C-') {
	        return 1.7;
	    } else if (leterGrade == 'D+') {
	        return 1.3;
	    } else if (letterGrade == 'D') {
	        return 1.0;
	    } else if (letterGrade == 'F') {
	        return 0.0;
	    } else {
	        return 0.0; 
	    }
	
}

	
}
