/**
 * @author 13213
 * @desc �������ڲ������
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
	//�ṩ��ȡ������Ϣ�Ľӿ�
	public abstract void getPersonInfo();
	
	//�ṩ�ڲ������ķ���
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
