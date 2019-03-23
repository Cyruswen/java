/**
 * @author chenlepeipei
 * @desc 内部类
 */
class OuterClass {
	private String msg = "这是内部类, 哈哈哈";
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
