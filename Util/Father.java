/**
 * @author chenlepeipei
 * @desc 测试继承
 */
public abstract class Father {
	public Father()
	{
		System.out.println("父类的构造方法");
	}
	
	/*
	public void logIn()
	{
		System.out.println("父类正在登陆QQ...");
	}
	
	public void logOut()
	{
		System.out.println("父类正在退出QQ...");
	}
	
	public void print()
	{
		System.out.println("我是父类");
	}
	*/
	public abstract void logIn();
	public abstract void logOut();
}
