import java.util.Scanner;

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
				Scanner userIntInput = new Scanner(System.in);
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("Which student's grade would you like to change?");
				int answerStudentNumber = userIntInput.nextInt();
				System.out.println(Database.students.get(answerStudentNumber).getFirstName() + " " + Database.students.get(answerStudentNumber).getLastName() + " \n(1) " + Database.students.get(answerStudentNumber).getClassName1() + " " + Database.students.get(answerStudentNumber).getClassGrade1() + " \n(2) " + Database.students.get(answerStudentNumber).getClassName2() + " " + Database.students.get(answerStudentNumber).getClassGrade2() + " \n(3) " + Database.students.get(answerStudentNumber).getClassName3() + " " + Database.students.get(answerStudentNumber).getClassGrade3());
				int answerStudentClass = userIntInput.nextInt();
				if(answerStudentClass == 1)
					{
						System.out.println("You are changing " + Database.students.get(answerStudentNumber).getClassName1() + ". What grade would you like to change it to?");
						String newGrade = userStringInput.nextLine();
						Database.students.get(answerStudentNumber).setClassGrade1(newGrade);
						System.out.println("The new grade for " + Database.students.get(answerStudentNumber).getClassName1() + " is a " + Database.students.get(answerStudentNumber).getClassGrade1());
					}
				
				
				
			}
	}
