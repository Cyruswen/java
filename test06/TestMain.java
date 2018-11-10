package test06;

public class TestMain {
	public static void main(String[] args)
	{
		Student stu = new Student("马晨佩", 21, "陕西科技大学机电");
//		stu.setName("凯凯");
//		stu.setAge(23);
//		stu.setSchool("陕西科技大学电信");
		System.out.println(stu.getName() + " " + stu.getAge() + " " + stu.getSchool());
	}
}
