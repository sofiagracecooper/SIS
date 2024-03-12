import java.util.Scanner;


public class AddDeleteStudents
	{

		
		public static void AddStudents()
		{
			Scanner userStringInput = new Scanner(System.in);
			Scanner userIntInput = new Scanner(System.in);
			Scanner userDoubleInput = new Scanner(System.in);
			
		
			System.out.println("Input the first name of the student..");
			String firstName =userStringInput .nextLine();
			
	
			System.out.println("Input the last name of the student.");
			String lastName = userStringInput.nextLine();
			
			
			System.out.println("Input the GPA of the student");
			double  GPA = userDoubleInput.nextDouble();
			
			System.out.println("Input the first class the student has.");
			String classNameOne = userStringInput.nextLine();
			
			System.out.println("Input the last name of the student.");
			String lastName = userStringInput.nextLine();
			
			
			
			
			
		}
		
		public static void DeleteStudent()
		{
			
		}
		
		

	}
