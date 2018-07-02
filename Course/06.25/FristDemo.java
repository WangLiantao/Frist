import java.util.Scanner;
public class FristDemo {
	public static void main(String[] args) {

		// 如何交换两个变量的值
		int a, b;
		a = 5;
		b =10;

		// 第一种方法 (转移,腾空一个值)
		int temp = a;
		a = b;
		// 腾空变量
		b = temp;
		System.out.print("a =" + a +"," + "b ="+b);
		 
		// 方法二
		
		a = 5;
		b =10;
		// 语句以分号结尾
		// 表达式:由变量,常量和运算符组成的一个具有返回值的式子
		a = a + b - (b = a);
		System.out.print("a =" + a +"," + "b ="+b);

		// 方法三
		a = 13;
		b = 18;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.print("a =" + a +"," + "b ="+b);

		// 创建数组
		int[] arr = new int[5];
		// 系统输入
		Scanner sc = new Scanner(System.in);

		// 求和
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入一个整数:");
			// 调用系统输入的值
			int num = sc.nextInt();
			arr[i] =num;
			sum += num;
		}

		// 数组中所有元素的和
		System.out.println("数组中所有元素的和:" + sum);
		// 平均数
		System.out.println("平均数为:" + (float)sum / 5);

	}


}