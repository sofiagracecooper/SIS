import java.util.ArrayList;

public class Student 
{
	private String firstName;
	private String lastName;
	private double gpa;
	private ArrayList<Course> courses;
	

	public Student(String firstName, String lastName, double gpa, ArrayList<Course> courses) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.courses = courses;
}


	public String getFirstName()
		{
			return firstName;
		}


	public void setFirstName(String firstName)
		{
			this.firstName = firstName;
		}


	public String getLastName()
		{
			return lastName;
		}


	public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}


	public double getGpa()
		{
			return gpa;
		}


	public void setGpa(double gpa)
		{
			this.gpa = gpa;
		}


	public ArrayList<Course> getCourses()
		{
			return courses;
		}


	public void setCourses(ArrayList<Course> courses)
		{
			this.courses = courses;
		}
}	
