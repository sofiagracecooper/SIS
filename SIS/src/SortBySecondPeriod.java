import java.util.Comparator;



public class SortBySecondPeriod implements Comparator<Student>

	{

	public int compare(Student s1, Student s2)

		{

		return s1.getClassName2().compareTo(s2.getClassName2());

		}

	}

