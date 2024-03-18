import java.util.Scanner;
import java.util.ArrayList;

public class AddDeleteStudents
	{

		
		public static void AddStudents()
		{
			Scanner userStringInput = new Scanner(System.in);
			Scanner userIntInput = new Scanner(System.in);
			Scanner userDoubleInput = new Scanner(System.in);
			
		
			System.out.println("Input the first name of the student..");
			String FN =userStringInput .nextLine();
			
	
			System.out.println("Input the last name of the student.");
			String LN = userStringInput.nextLine();
			
			
			double  GPA = 0.0;
			
			System.out.println("Input the first class the student has.");
			String classNameOne = userStringInput.nextLine();
			
			System.out.println("Input the grade this student has in this class.");
			String classOneGrade = userStringInput.nextLine();
			
			System.out.println("Input the second class the student has.");
			String classNameTwo = userStringInput.nextLine();
			
			System.out.println("Input the grade this student has in this class.");
			String classTwoGrade = userStringInput.nextLine();
			
			System.out.println("Input the third class the student has.");
			String classNameThree = userStringInput.nextLine();
			
			System.out.println("Input the grade this student has in this class.");
			String classThreeGrade = userStringInput.nextLine();
			
			Database.students.add(new Student(FN, LN ,GPA, classNameOne,  classOneGrade,classNameTwo, classTwoGrade, classNameThree, classThreeGrade));
			
		}
		
		public static void DeleteStudent()
		{
			
		}
		
		

	}
