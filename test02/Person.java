package test02;

/*public class Person {
	private String name;
	private int age;
	
	public Person()
	{
		System.out.println("new��һ���¶���");
	}
	
	public Person(String name)
	{
		System.out.println("new��һ���¶���");
		this.name = name;
	}
	
	public Person(String name, int age)
	{
		System.out.println("new��һ���¶���");
		this.name = name;
		this.age = age;
	}
	
	public void printInfo()
	{
		System.out.println("name: " + name + " age: " + age);
	}
	
	public void printSth()
	{
		System.out.println("************************");
	}
}*/

/*public class Person {
	private String name;
	private int age;
	
	public Person()
	{
		System.out.println("new��һ���¶���");
	}
	
	public Person(String name)
	{
		this();
		this.name = name;
	}
	
	public Person(String name, int age)
	{
		this(name);
		this.age = age;
	}
	
	public void printInfo()
	{
		System.out.println("name: " + name + " age: " + age);
	}
	
	public void printSth()
	{
		System.out.println("************************");
	}
}
*/
class Person
{
	public void printSth()
	{
		System.out.println("Print������" + this);
	}
}
