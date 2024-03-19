public class NameSorter 
	{
	public static int sortByName()
		{
		System.out.println(Database.students.get(0).getLastName().compareTo(Database.students.get(1).getLastName()));
		return Database.students.get(0).getLastName().compareTo(Database.students.get(1).getLastName());
		}
	}
