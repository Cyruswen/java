public class PersonInfo {
	private String _name;
	private int _age;
	
	{
		System.out.println("构造块");
	}
	
	public PersonInfo()
	{
		System.out.println("无参构造方法");
	}
	
	static {
		System.out.println("静态构造块");
	}
	
	public PersonInfo(String name)
	{
		this();
		this._name = name;
	}
	
	public PersonInfo(String name, int age) {
		this(name);
		this._age = age;
	}
	
	public void getInfo(){
		System.out.println("age: " + this._age + "  name: " + this._name);
	}
}
