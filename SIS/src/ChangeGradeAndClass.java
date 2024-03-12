
public class ChangeGradeAndClass
	{
		public static void listStudents()
		{
			int count = 1;
			for(Student s: Database.students)
				{
					System.out.println(count + ". " + s.getFirstName() +  " " + s.getLastName());
					count++;
				}
		}

		public static void changeGrade()
			{
				System.out.println("Which student's grade would you like to change?");
				
			}
	}
