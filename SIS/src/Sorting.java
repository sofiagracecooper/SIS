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
			PrintStudents.printStudents();
			}
		
		else if(sortingChoice == 2)
		{
		
		}
		
		else if(sortingChoice == 3)
			{
			System.out.println("What period would you like to sort by? \n1) First Period \n2) Second Period \n3) Third Period");
			int periodChoice = scanner.nextInt();
		
			if(periodChoice == 1)
				{
				Collections.sort(Database.students, new SortByFirstPeriod());
				PrintStudents.printStudents();
				}
			
			else if(periodChoice == 2)
				{
				Collections.sort(Database.students, new SortBySecondPeriod());
				PrintStudents.printStudents();
				}
			
			else if(periodChoice == 3)
				{
				Collections.sort(Database.students, new SortByThirdPeriod());
				PrintStudents.printStudents();
				}
	
		}
	
		else
		{
		howToSort();
		}
		scanner.close();
		}
	}

