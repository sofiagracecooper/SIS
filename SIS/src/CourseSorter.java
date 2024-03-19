public class CourseSorter 
	{
	public static int sortByCourse()
			{
			//System.out.println(Database.students.get(1).getClassName1().compareTo(Database.students.get(0).getClassName1()));
			
			
			for(int i = 0; i < Database.students.size(); i++)
				{
				System.out.println(Database.students.get(i).getClassName1().compareTo(Database.students.get(i+1).getClassName1()));
				
				if(Database.students.get(i).getClassName1() < Database.students.get(i+1).getClassName1())
					{
					
					}
				}
			
			return Database.students.get(0).getClassName1().compareTo(Database.students.get(1).getClassName1());
			}
	
	}
