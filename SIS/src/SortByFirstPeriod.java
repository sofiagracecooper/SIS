import java.util.Comparator;



public class SortByFirstPeriod implements Comparator<Student>

	{

	public int compare(Student s1, Student s2)

		{

		return s1.getClassName1().compareTo(s2.getClassName1());

		}
	}