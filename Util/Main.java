public class Main {

	public static void main(String[] args) {
		
		 // ����ת��������
		/*
		MonthIncome month = new MonthIncome(500001);
		int monthIn = month.getMonthIncome();
		System.out.println("������: " + monthIn);
		*/
		//������ ����
		/*
		int[] intArray = new int[] {1,3,4,5,6,7,2};
		Util.printArray(intArray);
		char[] charArray = new char[] {'a', 'b', 'c', 'd', 'e'};
		Util.printArray(charArray);
		*/
		//���Թ��캯��
		/*
		PersonInfo perInfo = new PersonInfo("kaikai", 23);
		perInfo.getInfo();
		PersonInfo perInfo1 = new PersonInfo();
		PersonInfo perInfo2 = new PersonInfo();
		*/
		//�ڲ������
		/*
		OuterClass outer = new OuterClass();
		outer.fun();
		*/
		//�̳в���
		//Child child = new Child();
		//child.logIn("�¿���");
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
