package test05;

public class Outer2 {
	private static String msg = "hello world";
	static class Inner
	{
		public void print()
		{
			System.out.println(msg);
		}
	}
	
	public void func()
	{
		Inner in = new Inner();
		in.print();
	}
}
