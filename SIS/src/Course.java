public class Course 
	{
	private int period;
	private String className;
	private String letterGrade;
	
	public int getPeriod()
		{
		return period;
		}
	public void setPeriod(int period)
		{
		this.period = period;
		}
	public String getClassName()
		{
		return className;
		}
	public void setClassName(String className)
		{
		this.className = className;
		}
	public String getLetterGrade()
		{
		return letterGrade;
		}
	public void setLetterGrade(String letterGrade)
		{
		this.letterGrade = letterGrade;
		}
	public Course(int period, String className, String letterGrade)
		{
		this.period=period;
		this.className=className;
		this.letterGrade=letterGrade;
		}
	}
