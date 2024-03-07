import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class arrayLists
	{
		ArrayList<Student> students = new ArrayList<Student>();
		public static void fillArrayList()
		{
			Scanner myFile = new Scanner(new File("Studentlist.txt"));
				while(myFile.hasNext())
					{
					String firstName = myFile.next();
					String lastName = myFile.next();
					Course course1.className = myFile.next();
					Course course1.letterGrade = myFile.next();
					Course course2.className = myFile.next();
					Course course2.letterGrade = myFile.next();
					Course course3.className = myFile.next();
					Course course3.letterGrade = myFile.next();
					
					students.add()
					
					}
		}

	
	}
