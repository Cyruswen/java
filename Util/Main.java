public class Main {

	public static void main(String[] args) {
		
		 // 测试转化月收入
		/*
		MonthIncome month = new MonthIncome(500001);
		int monthIn = month.getMonthIncome();
		System.out.println("月收入: " + monthIn);
		*/
		//工具类 测试
		/*
		int[] intArray = new int[] {1,3,4,5,6,7,2};
		Util.printArray(intArray);
		char[] charArray = new char[] {'a', 'b', 'c', 'd', 'e'};
		Util.printArray(charArray);
		*/
		//测试构造函数
		/*
		PersonInfo perInfo = new PersonInfo("kaikai", 23);
		perInfo.getInfo();
		PersonInfo perInfo1 = new PersonInfo();
		PersonInfo perInfo2 = new PersonInfo();
		*/
		//内部类测试
		/*
		OuterClass outer = new OuterClass();
		outer.fun();
		*/
		//继承测试
		//Child child = new Child();
		//child.logIn("温凯凯");
		//child.logOut();
		//LittleChild son = new LittleChild();
		//son.logIn();
		//Father fa = new Child();
		//fa.print();
		//Child ch = (Child) new Father();
		Child child = new Child();
		child.logIn();
		Father fa = new Child();
		fa.logOut();
		fa.logIn();
	}
}
