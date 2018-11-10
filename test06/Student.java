package test06;

public class Student extends Person{
	private String School;
	
	public Student(String name, int age, String School) {
		super(name, age);
		this.School = School;
	}
	
	public String getSchool()
	{
		return this.School;
	}
	
	public void setSchool(String School)
	{
		this.School = School;
	}	
}
