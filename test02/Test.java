package test02;

public class Test {
	private int age;
	private String name;
	
	public Test()
	{
		System.out.println("调用构造函数");
	}
	
	public void getInfo()
	{
		System.out.println("age: " + age + "name: " + name);
	}
}
