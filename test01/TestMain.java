package test01;

public class TestMain {

//	public static void main(String[] args) {
 	 // TODO Auto-generated method stub
//		String str = "hello world!";
//		String str2 = new String("hello world!");
//		System.out.println(str == str2);
//		System.out.println(str.equals(str2));
//		String str3 = null;
//		System.out.println(str3.equals(str2));
//		System.out.println(str);
//	}
	public static void main(String[] args) {
//		int[] arr = new int[3];
//		int[] arr = null;
//		arr = new int[3];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		int arr[] = {1, 2, 3};
		int arr[] = new int[3];
		arr[1] = 1;
		arr[2] = 2;
		arr[0] = 0;
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
