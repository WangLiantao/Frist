import java.util.Scanner;
public class Computers {

	public static void main(String[] args) {
		// 系统录入两个数求和
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个整数:");
		int[] arr;
		arr = new int[3];
		// he(arr);
		// 系统会自动按照录入顺序进行赋值
		// 方法
		
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		

		// 定义变量要给其初始值
	// }	
		// static int he(int He) {
		// 	for (int i =0;i < arr.length; i++){
		// 		int a = arr[0];
		// 		int b = arr[1];
		// 		int c = arr[2];
		// 	    相当于重新赋值
				int He = a + b + c;
		// }
		System.out.println("这三个数的和是" + He);
		// }
	}
	


}