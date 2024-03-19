import java.util.Collections;
import java.util.Scanner;

public class Sorting 
	{
	
	public static void howToSort()
		{
		Scanner scanner = new Scanner(System.in);
		System.out.println("How would you like to sort the students? \n1) Last Name \n2) GPA \n3) Period");
		int sortingChoice = scanner.nextInt();
		
		if(sortingChoice == 1)
			{
			Collections.sort(Database.students, new NameSorter());
			}
		
		else if(sortingChoice == 2)
			{
			
			}
		
		else if(sortingChoice == 3)
			{
			Collections.sort(Database.students, new CourseSorter());
			}
		
		else
			{
			howToSort();
			}
		}
	}
