/**
 * @author chenlepeipei
 * @desc �ڲ���
 */
class OuterClass {
	private String msg = "�����ڲ���, ������";
	class InnerClass
	{
		public void print()
		{
			System.out.println(msg);
		}
	}
	
	public void fun()
	{
		/*
		InnerClass inner = new InnerClass();
		inner.print();
		*/
		(new InnerClass()).print();
	}
}
