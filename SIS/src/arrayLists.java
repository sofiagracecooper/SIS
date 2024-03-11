import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayLists
	{
		ArrayList<Student> students = new ArrayList<Student>();
		public static void fillArrayList() throws FileNotFoundException
		{
			Scanner myFile = new Scanner(new File("Studentlist.txt"));
				while(myFile.hasNext())
					{
					students.add(new Student(myFile.next(), myFile.next(), myFile)
					String firstName = myFile.next();
					String lastName = myFile.next();
					String className1 = myFile.next();
					String classGrade1 = myFile.next();
					String className2 = myFile.next();
					String classGrade2 = myFile.next();
					String className3 = myFile.next();
					String classGrade3 = myFile.next();
					

					
					}
		}

	
	}
