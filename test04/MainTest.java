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
		System.out.println("MainTest�Ĺ����");
	}
	
	public MainTest()
	{
		System.out.println("MainTest��Ĺ��췽��");
	}
	
	static
	{
		System.out.println("MainTest��ľ�̬����");
	}
	
	public static void main(String[] args)
	{
		System.out.println("----- start -----");
		new MainTest();
		new MainTest();
		System.out.println("----- end ------");
	}
}
