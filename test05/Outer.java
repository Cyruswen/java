package test05;

public class Outer {
	private String name = "kaikai";
	
	public String getMsg()
	{
		return this.name;
	}
	
	public void func()
	{
		Inner in = new Inner(this);
		in.print();
	}
}
