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
			lastName();
			}
		
		else if(sortingChoice == 2)
			{
			GPA();
			}
		
		else if(sortingChoice == 3)
			{
			period();
			}
		
		else
			{
			howToSort();
			}
		}
	}
