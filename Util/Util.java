/**
 * @author chenlepeipei
 * @other 工具类
 */
public class Util {
	/**
	 * @other 打印数组(整形)
	 * @author chenlepeipei
	 * @param x
	 */
	public static void printArray(int[] x)
	{
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * @other 打印数组(字符)
	 * @author chenlepeipei
	 * @param x
	 */
	public static void printArray(char[] x) 
	{
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
}
