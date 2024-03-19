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
					answer = userIntInput.nextInt();
						if(answer == 1)
							{
								AddDeleteStudents.AddStudents();
							}
						else if(answer == 2)
							{
								AddDeleteStudents.DeleteStudent();
							}

				}
			else if(answer == 2)
				{
					System.out.println("What would you like to do? \n(1) Change a student's Grade \n(2) Change a student's schedule");
					int answerGradeAndClass = userIntInput.nextInt();
						if(answerGradeAndClass == 1)
							{
								ChangeGradeAndClass.listStudents();
								ChangeGradeAndClass.changeGrade();
							}
						else if(answer == 2)
							{
								//ChangeGradeAndClass.changeClass();
							}
				}
			else if(answer == 3)
				{
					
				}
		}
	}
