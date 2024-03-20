import java.util.Comparator;
import java.util.Scanner;


public class CourseSorter implements Comparator<Student>
	{
	
	public static void whatClass()
		{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What period do you want to sort by? \n1) First Period \n2) Second Period \n3) Third Period");
		
		int classChoice = scanner.nextInt();
		}
	
	public int compare(Student s1,  Student s2)
		{
		
		return s1.getClassName1().compareTo(s2.getClassName1());
		}
	
	
	
	}
