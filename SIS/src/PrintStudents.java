public class PrintStudents 
	{
	public static void printStudents()
		{
		for(int i = 0; i < Database.students.size(); i++)
			{
			System.out.println(Database.students.get(i).getFirstName() + " " +
						 	   Database.students.get(i).getLastName() + " " +
						 	   Database.students.get(i).getClassName1() + " " +
						 	   Database.students.get(i).getClassGrade1() + " " +
						 	   Database.students.get(i).getClassName2() + " " +
						 	   Database.students.get(i).getClassGrade2() + " " +
						 	   Database.students.get(i).getClassName3() + " " +
						 	   Database.students.get(i).getClassGrade3());
			System.out.println(" ");
			}
		}
	}
