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
				int answerStudentNumber = userIntInput.nextInt()-1;
				System.out.println(Database.students.get(answerStudentNumber).getFirstName() + " " + Database.students.get(answerStudentNumber).getLastName() + " \n(1) " + Database.students.get(answerStudentNumber).getClassName1() + " " + Database.students.get(answerStudentNumber).getClassGrade1() + " \n(2) " + Database.students.get(answerStudentNumber).getClassName2() + " " + Database.students.get(answerStudentNumber).getClassGrade2() + " \n(3) " + Database.students.get(answerStudentNumber).getClassName3() + " " + Database.students.get(answerStudentNumber).getClassGrade3());
				int answerStudentClass = userIntInput.nextInt();
				if(answerStudentClass == 1)
					{
						System.out.println("You are changing " + Database.students.get(answerStudentNumber).getClassName1() + ". What grade would you like to change it to?");
						String newGrade = userStringInput.nextLine();
						Database.students.get(answerStudentNumber).setClassGrade1(newGrade);
						System.out.println("The new grade for " + Database.students.get(answerStudentNumber).getClassName1() + " is a " + Database.students.get(answerStudentNumber).getClassGrade1());
					}
				else if(answerStudentClass == 2)
					{
						System.out.println("You are changing " + Database.students.get(answerStudentNumber).getClassName2() + ". What grade would you like to change it to?");
						String newGrade = userStringInput.nextLine();
						Database.students.get(answerStudentNumber).setClassGrade2(newGrade);
						System.out.println("The new grade for " + Database.students.get(answerStudentNumber).getClassName2() + " is a " + Database.students.get(answerStudentNumber).getClassGrade2());
					}
				else if(answerStudentClass == 3)
					{
						System.out.println("You are changing " + Database.students.get(answerStudentNumber).getClassName3() + ". What grade would you like to change it to?");
						String newGrade = userStringInput.nextLine();
						Database.students.get(answerStudentNumber).setClassGrade3(newGrade);
						System.out.println("The new grade for " + Database.students.get(answerStudentNumber).getClassName3() + " is a " + Database.students.get(answerStudentNumber).getClassGrade3());
					}
				
			}
		public static void changeClass()
		{
			Scanner userIntInput = new Scanner(System.in);
			Scanner userStringInput = new Scanner(System.in);
			String class1Name = null;
			
			System.out.println("Which student's classes do you want to change?");
			int studentNumber = userIntInput.nextInt()-1;
			System.out.println("Here are " + Database.students.get(studentNumber).getFirstName() + " " + Database.students.get(studentNumber).getLastName() + "'s classes:\n(1) " + Database.students.get(studentNumber).getClassName1() + "\n(2) " + Database.students.get(studentNumber).getClassName2() + "\n(3) " + Database.students.get(studentNumber).getClassName3() + "\nWhich one would you like to change?" );
			int firstClass = userIntInput.nextInt();
			System.out.println("What period would you like to put it into?");
			int secondClass = userIntInput.nextInt();
			if(secondClass == 1)
				{
					class1Name = Database.students.get(studentNumber).getClassName1();
					if(firstClass == 1)
					{
						Database.students.get(studentNumber).setClassName1(Database.students.get(studentNumber).getClassName1());
						
					}
					else if(firstClass == 2)
					{
						Database.students.get(studentNumber).setClassName1(Database.students.get(studentNumber).getClassName2());
						Database.students.get(studentNumber).setClassName2(class1Name);	
					}
					else if(firstClass == 3)
					{
						Database.students.get(studentNumber).setClassName1(Database.students.get(studentNumber).getClassName3());
						Database.students.get(studentNumber).setClassName3(class1Name);	
					}
					
				}
			else if(secondClass == 2)
				{
					class1Name = Database.students.get(studentNumber).getClassName2();
					if(firstClass == 1)
					{
						Database.students.get(studentNumber).setClassName2(Database.students.get(studentNumber).getClassName1());
						Database.students.get(studentNumber).setClassName2(class1Name);
					}
					else if(firstClass == 2)
					{
						Database.students.get(studentNumber).setClassName2(Database.students.get(studentNumber).getClassName2());
						Database.students.get(studentNumber).setClassName2(class1Name);	
					}
					else if(firstClass == 3)
					{
						Database.students.get(studentNumber).setClassName2(Database.students.get(studentNumber).getClassName3());
						Database.students.get(studentNumber).setClassName3(class1Name);	
					}
				}
			else if(secondClass == 3)
				{
					class1Name = Database.students.get(studentNumber).getClassName3();
					if(firstClass == 1)
					{
						Database.students.get(studentNumber).setClassName3(Database.students.get(studentNumber).getClassName1());
						Database.students.get(studentNumber).setClassName1(class1Name);
					}
					else if(firstClass == 2)
					{
						Database.students.get(studentNumber).setClassName3(Database.students.get(studentNumber).getClassName2());
						Database.students.get(studentNumber).setClassName2(class1Name);	
					}
					else if(firstClass == 3)
					{
						Database.students.get(studentNumber).setClassName3(Database.students.get(studentNumber).getClassName3());
						Database.students.get(studentNumber).setClassName3(class1Name);	
					}	
				}
			System.out.println("Here are " + Database.students.get(studentNumber).getFirstName() + " " + Database.students.get(studentNumber).getLastName() + "'s classes:\n(1) " + Database.students.get(studentNumber).getClassName1() + "\n(2) " + Database.students.get(studentNumber).getClassName2() + "\n(3) " + Database.students.get(studentNumber).getClassName3() + "\nWhich one would you like to change?" );
			
			
		}	
	}
