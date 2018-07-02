import java.util.Scanner;
public class FenShu {

	public static void main(String[] args) {

		// 创建一个二维数组
		int[][] scoreArr = new int[3][5];
		// Scanner对象接收录入的值
		Scanner sc = new Scanner(System.in);

		int[] totalscore = new int[3];

		// scoreArr.length:指的是scoreArr数组的长度
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "班的分数:");

			// scoreArr[i].length:指的是scoreArr[i]数组的长度(分scoreArr[1],scoreArr[2],scoreArr[3]) 其长度由new int[3][5]限制.

		
			for (int j = 0; j < scoreArr[i].length; j++) {

				System.out.print("第" + (j + 1) + "个人分数为:" );

				int num = sc.nextInt();
				scoreArr[i][j] = num;
				totalscore[i] += num;
			}

			

		}

		for (int i = 0;i < totalscore.length; i++) {
			System.out.println("第" + (i + 1) + "班的总分数为" + totalscore[i]);
		}

	}
}


		
