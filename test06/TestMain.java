package test06;

public class TestMain {
	public static void main(String[] args)
	{
		Student stu = new Student("����", 21, "�����Ƽ���ѧ����");
//		stu.setName("����");
//		stu.setAge(23);
//		stu.setSchool("�����Ƽ���ѧ����");
		System.out.println(stu.getName() + " " + stu.getAge() + " " + stu.getSchool());
	}
}
