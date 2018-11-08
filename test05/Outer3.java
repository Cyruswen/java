package test05;

public class Outer3 {
	private static String msg = "hello world";
	
	public void func(int num)
	{
		class Inner
		{
			public void print()
			{
				System.out.println("num: " + num);
				System.out.println("msg: " + msg);
			}
		}
		
		new Inner().print();
	}
}	
