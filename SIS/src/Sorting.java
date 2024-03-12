import java.util.Scanner;

public class Sorting 
	{
	public static void main(String [] args)
		{
		howToSort();
		}
	
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
			//GPA();
			}
		
		else if(sortingChoice == 3)
			{
			//period();
			}
		
		else
			{
			howToSort();
			}
		}
	
	public static void lastName()
		{
		System.out.println(arrayLists.student.getLastName(1));
		}
	
//	public static void GPA()
//		{
//		for(int i = 0;)
//		}
//	
//	public static void period()
//		{
//		for(int i = 0;)
//		}
	}
