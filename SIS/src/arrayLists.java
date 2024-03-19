import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayLists
	{

		static ArrayList<Student> students = new ArrayList<Student>();
		public static void fillArrayList() throws IOException

		{

			Scanner myFile = new Scanner(new File("Studentlist.txt"));
				while(myFile.hasNext())
					{
					students.add(new Student(myFile.next(), myFile.next(), myFile.next(), myFile.next(), myFile.next(), myFile.next(), myFile.next(), myFile.next(), 0.0));
					}
		}

	
	}
