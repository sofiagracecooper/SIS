public class GPASorter 	
	{
	public static void sortByGPA()
		{

		CalculateGPA.calculateGPA(Database.students.get(0));
		System.out.println(Database.students.get(0).getGpa());

		}
	
	}
