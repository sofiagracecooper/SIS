

public class Student 
{
	private String firstName;
	private String lastName;
	private double gpa;
	private String className1;
	private String classGrade1;
	private String className2;
	private String classGrade2;
	private String className3;
	private String classGrade3;
	

	public String getClassName1()
		{
			return className1;
		}


	public void setClassName1(String className1)
		{
			this.className1 = className1;
		}


	public String getClassGrade1()
		{
			return classGrade1;
		}


	public void setClassGrade1(String classGrade1)
		{
			this.classGrade1 = classGrade1;
		}


	public String getClassName2()
		{
			return className2;
		}


	public void setClassName2(String className2)
		{
			this.className2 = className2;
		}


	public String getClassGrade2()
		{
			return classGrade2;
		}


	public void setClassGrade2(String classGrade2)
		{
			this.classGrade2 = classGrade2;
		}


	public String getClassName3()
		{
			return className3;
		}


	public void setClassName3(String className3)
		{
			this.className3 = className3;
		}


	public String getClassGrade3()
		{
			return classGrade3;
		}


	public void setClassGrade3(String classGrade3)
		{
			this.classGrade3 = classGrade3;
		}


	public Student(String firstName, String lastName, String className1, String classGrade1, String className2, String classGrade2, String className3, String classGrade3, double gpa) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.className1 = className1;
	    this.classGrade1 = classGrade1;
	    this.className2 = className2;
	    this.classGrade2 = classGrade2;
	    this.className3 = className3;
	    this.classGrade3 = classGrade3;
	    this.gpa = gpa;
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

}	
