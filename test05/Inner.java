package test05;

public class Inner {
	Outer out = new Outer();
	public Inner(Outer out)
	{
		this.out = out;
	}
	
	public void print()
	{
		System.out.println(out.getMsg());
	}
}
