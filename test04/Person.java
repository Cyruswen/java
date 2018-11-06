package test04;

/*public class Person {
	{//定义在类中，不加修饰符构造块
		System.out.println("Person类的构造块");
	}
	
	public Person()
	{
		System.out.println("Person类的构造方法");
	}
}*/

public class Person
{
	{
		System.out.println("Person类的构造块");
	}
	
	public Person()
	{
		System.out.println("Person类的构造方法");
	}
	
	static
	{
		System.out.println("Person类的静态块");
	}
}