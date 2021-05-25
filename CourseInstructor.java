import java.util.*;
class CourseInstructor
{
	String courseName,instructorsName;
	CourseInstructor(String courseName, String instructorsName)
	{
		courseName = courseName;
		instructorsName = instructorsName;
	}
	void setCourseName(String s)
	{
		courseName = s;
	}
	void setInstructorsName(String s)
	{
		instructorsName = s;
	}
	String getCourseName()
	{
		return courseName;
	}
	String getInstructorName()
	{
		return instructorsName;
	}
	void displayMessage()
	{
		System.out.println("This course is presented by : "+instructorsName);
	}
	public static void main(String[] args)
	{
		String courseInstructor,courseName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course instructor name : ");
		courseInstructor = sc.nextLine();

		System.out.println("Enter Course name : ");
		courseName = sc.nextLine();
		CourseInstructor c = new CourseInstructor(courseName,courseInstructor);
		c.setCourseName(courseName);
		c.setInstructorsName(courseInstructor);
		String temp = c.getCourseName();
		
		String temp1 = c.getInstructorName();
		System.out.println("\nInstructor name : "+temp1);
		System.out.println("Course name : "+temp+"\n");
		c.displayMessage();
		
	}
}
