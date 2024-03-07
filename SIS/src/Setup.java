import java.util.ArrayList;

public class Setup {
private String firstName;
private String lastName;
private double gpa;
private ArrayList<Course> courses;

public Student(String firstName, String lastName, ArrayList<Course> courses) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.courses = courses;
}
public ArrayList<Course> getCourses() {
    return courses;
}
}
