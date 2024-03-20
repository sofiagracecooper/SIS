import java.util.Comparator;



public class SortByThirdPeriod implements Comparator<Student>

	{

	public int compare(Student s1, Student s2)

		{

		return s1.getClassName3().compareTo(s2.getClassName3());

		}

	}