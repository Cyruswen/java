public class PersonInfo {
	private String _name;
	private int _age;
	
	{
		System.out.println("�����");
	}
	
	public PersonInfo()
	{
		System.out.println("�޲ι��췽��");
	}
	
	static {
		System.out.println("��̬�����");
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
