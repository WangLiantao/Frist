import java.util.Scanner;
public class FristDemo {


	public static void main(String[] args) {
		int [] arr = new int[2];
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		// arr.length:arr数组的长度(个数)
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入一个整数:");

			int num = sc.nextInt();
			arr[i] =num;
			sum += num;
		}

		System.out.println("两个整数的和:" + sum);

		System.out.println("平均数为:" + (float)sum/2);

	}

}