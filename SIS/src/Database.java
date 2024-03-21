import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Database
	{
		static ArrayList<Student> students = new ArrayList<Student>();
		public static void fillArrayList() throws IOException
		{
			Scanner myFile = new Scanner(new File("Studentlist.txt"));
				while(myFile.hasNext())
					{
					String firstName = myFile.next();
			        String lastName = myFile.next();
			        String className1 = myFile.next();
			        String classGrade1 = myFile.next();
			        String className2 = myFile.next();
			        String classGrade2 = myFile.next();
			        String className3 = myFile.next();
			        String classGrade3 = myFile.next();
					students.add(new Student(firstName, lastName, className1, classGrade1, className2, classGrade2, className3, classGrade3, 0.0));

					
					}
		}

	
	}
