package test02;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test test = new Test();
//		test.getInfo();		
//		Person kaikai = new Person("kaikai", 22);
//		kaikai.printInfo();
		
//		Person per1 = new Person();
//		Person per2 = new Person("kaikai");
//		Person per3 = new Person("kaikai", 23);
//		per1.printInfo();
//		per2.printInfo();
//		per3.printInfo();
		
		Person per1 = new Person();
		System.out.println("Main方法：" + per1);
		per1.printSth();
		Person per2 = new Person();
		System.out.println("Main方法：" + per2);
		per2.printSth();
	}

}
