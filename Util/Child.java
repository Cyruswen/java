/**
 * @author 13213
 * @desc �̳в�������
 */
public class Child extends Father
{
	public Child()
	{
		System.out.println("����Ĺ��췽��");
	}

	@Override
	public void logIn() {
		System.out.println("�������ڵ�½QQ...");
	}

	@Override
	public void logOut() {
		System.out.println("���������˳�QQ...");
	}
	
	/*
	@Override
	public void logIn()
	{
		System.out.println("�������ڵ�½QQ...");
	}
	
	public void logIn(String user)
	{
		System.out.println(user + "���ڵ�½QQ...");
	}
	*/
	/*
	public void print()
	{
		System.out.println("��������");
	}
	*/
}
