package test04;

public class MainTest {
/*
	public static void main(String[] args) {
		System.out.println("----- start -----");
		new Person();
		new Person();
		System.out.println("----- end ------");
	}
*/
	{
		System.out.println("MainTest的构造块");
	}
	
	public MainTest()
	{
		System.out.println("MainTest类的构造方法");
	}
	
	static
	{
		System.out.println("MainTest类的静态方法");
	}
	
	public static void main(String[] args)
	{
		System.out.println("----- start -----");
		new MainTest();
		new MainTest();
		System.out.println("----- end ------");
	}
}
