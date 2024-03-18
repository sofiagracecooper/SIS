public class GPASorter 	
	{
	public static void sortByGPA()
		{
		CalculateGPA.calculateGPA();
		System.out.println(Database.students.get(1).getGpa());
		}
	
	}
