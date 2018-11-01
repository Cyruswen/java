package test01;
import java.util.*;
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
//	public static void main(String[] args) {
//		int[] arr = new int[3];
//		int[] arr = null;
//		arr = new int[3];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		int arr[] = {1, 2, 3};
//		int arr[] = new int[3];
//		arr[1] = 1;
//		arr[2] = 2;
//		arr[0] = 0;
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
//		int arr[] = null;
//		int tmp[] = null;
//		arr = new int[4];
//		arr[0] = 0;
//		arr[1] = 1;
//		arr[2] = 2;
//		arr[3] = 3;
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
//		tmp = arr;
//		tmp[0] = 9;
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.println(tmp[i]);
//		}
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.println(arr[i]);
//    	}
//		int arr[] = {1,2,3,4,5,6,7,8,9};
//		System.out.println(arr.length);
//		System.out.println(new int[]{1,2,3,4,5}.length);	
//	}
	
//	public static int[] init()
//	{
//		return new int[] {1,2,3,4,5,6};
//	}
//	
	public static void printArr(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void printArr(char[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
//	public static void bigger(int[] arr)
//	{
//		for(int i = 0; i < arr.length; i++)
//		{
//			arr[i] *= 5;
//		}
//	}
//	
//	public static void main(String[] args)
//	{
//		int[] arr = init();
//		bigger(arr);
//		printArr(arr);
//	}
	
//	public static void main(String[] args)
//	{
//		int[] intArr  = new int[] {3,4,5,1,7,4};
//		char[] charArr = new char[] {'a', 'w', 'r', 'l'};
//		java.util.Arrays.sort(intArr);
//		Arrays.sort(intArr);
//		Arrays.sort(charArr);
//		printArr(intArr);
//		printArr(charArr);
//	}
	
//	public static void main(String[] args)
//	{
//		int[] arr1 = new int[] {1,2,3,4,5,6};
//		int[] arr2 = new int[] {11,22,33,44,55,66};
//		System.arraycopy(arr2, 3, arr1, 2, 3);
//		printArr(arr1);
//	}
	
	public static void main(String[] args)
	{
		processData(new int[] {1,2,3,4,5,6,7,8});
	}
	
	public static void processData(int[] data)
	{
		double[] result = new double[4];
		result[0] = data[0];
		result[1] = data[0];
		result[2] = 0;
		result[3] = data[0];
		for(int i = 0; i < data.length; i++)
		{
			if(result[0] < data[i])
			{
				result[0] = data[i];   //最大值
			}
			if(result[1] > data[i])
			{
				result[1] = data[i];   //最小值
			}
			result[2] += data[i];  //sum
		}
		result[3] = result[2] / data.length;
		System.out.println("最大值：" + result[0]);
		System.out.println("最小值：" + result[1]);
		System.out.println("元素和：" + result[2]);
		System.out.println("平均值：" + result[3]);
	}
}


























