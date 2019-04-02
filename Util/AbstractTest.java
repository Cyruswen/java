/**
 * @author 13213
 * @desc 抽象类内部类测试
 */
public abstract class AbstractTest {
	private String name = null;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	//提供获取个人信息的接口
	public abstract void getPersonInfo();
	
	//提供内部类对象的方法
	public static AbstractTest getInstance()
	{
		class Student extends AbstractTest{
			public void getPersonInfo()
			{
				System.out.println(this.getName());
			}
		}
		return new Student();
	}
}
