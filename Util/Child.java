/**
 * @author 13213
 * @desc 继承测试子类
 */
public class Child extends Father
{
	public Child()
	{
		System.out.println("子类的构造方法");
	}

	@Override
	public void logIn() {
		System.out.println("子类正在登陆QQ...");
	}

	@Override
	public void logOut() {
		System.out.println("子类正在退出QQ...");
	}
	
	/*
	@Override
	public void logIn()
	{
		System.out.println("子类正在登陆QQ...");
	}
	
	public void logIn(String user)
	{
		System.out.println(user + "正在登陆QQ...");
	}
	*/
	/*
	public void print()
	{
		System.out.println("我是子类");
	}
	*/
}
