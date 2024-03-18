import java.text.DecimalFormat;
import java.util.ArrayList;

public class CalculateGPA 
{
	private DecimalFormat decimalFormat = new DecimalFormat("0.00");
	
	public double calculateGPA(Student student)
	{
		String[] classNames = {student.getClassName1(), student.getClassName2(), student.getClassName3()};
        String[] letterGrades = {student.getClassGrade1(), student.getClassGrade2(), student.getClassGrade3()};
        double totalGradePoints = 0.0;
        
        for(int i=0;i<classNames.length;i++)
        {
        	totalGradePoints+=convertGradeToNum(letterGrades[i]);
        }
	
	
	double gpa=totalGradePoints/classNames.length;
	
	return Double.parseDouble(decimalFormat.format(gpa));
	
}
	
	private double convertGradeToNum(String letterGrade) {
		double count = 0.0;
		double gradePointAverage= 0.0;
	    if (letterGrade.equals("A+")) {
	        count += 4.3;
	    } else if (letterGrade.equals("A")) {
	        count += 4.0;
	    } else if (letterGrade.equals("A-")) {
	        count += 3.7;
	    } else if (letterGrade.equals("B+")) {
	        count += 3.3;
	    } else if (letterGrade.equals("B")) {
	        count += 3.0;
	    } else if (letterGrade.equals("B-")) {
	        count += 2.7;
	    } else if (letterGrade.equals("C+")) {
	        count += 2.3;
	    } else if (letterGrade.equals("C")) {
	        count += 2.0;
	    } else if (letterGrade.equals("C-")) {
	        count += 1.7;
	    } else if (letterGrade.equals("D+'")) {
	        count += 1.3;
	    } else if (letterGrade.equals("D")) {
	        count += 1.0;
	    }
	      else if(letterGrade.equals("D-")) {
	        count += 0.7;
	    }else if (letterGrade.equals("F")) {
	        count += 0.0;
	    } else {
	        count += 0.0; 
	    }
	    return count;
	}
}
