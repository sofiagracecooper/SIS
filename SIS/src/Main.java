import java.io.IOException;
import java.util.Scanner;

public class Main
	{
		public static void main(String[] args) throws IOException
		{
		Database.fillArrayList();
		//Sorting.howToSort();
		//CalculateGPA.calculateGPA();
			
			Scanner userIntInput = new Scanner(System.in);
		
			System.out.println("What would you like to do? \n(1) Add or delete a student \n(2) Change current grades/schedule \n(3) Sort students");
			int answer = userIntInput.nextInt();
			if(answer == 1)
				{
					System.out.println("What would you like to do? \n(1) Add a Student? \n(2) Delete a Student?");
					int answer2 = userIntInput.nextInt();
						if(answer2 == 1)
							{
								AddDeleteStudents.AddStudents();
							}
						else if(answer2 == 2)
							{
								AddDeleteStudents.DeleteStudent();
							}

				}
			else if(answer == 2)
				{
					//ChangeGradeAndSchedule();
				}
			else if(answer == 3)
				{
					
				}
		}
	}
