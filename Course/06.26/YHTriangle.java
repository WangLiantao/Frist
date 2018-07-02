public class YHTriangle {

	public  static void main (String[] args) {
		// %d  代表整型
		// %sd 短整型
		// %f 代表浮点
		// %s 代表字符串
		// %c 字符串

		// %4d 代表第四位对齐
		System.out.printf("%4d\n",5);
		System.out.printf("%4d\n",1995);


		// 格式化(占位符)输出函数
		// 大数组(外循环)必须定空间
		int[][] arr = new int [13][];
		for (int i = 0; i < arr.length; i++) {
			// 第i个元素的长度  初始化
			arr[i] = new int[i+1];

			// 输出空格
			for (int k = 0; k < arr.length - 1 - i; k++) {
				System.out.print("  ");
			}

			for (int j = 0;j < arr[i].length; j++){

				if (j == 0||j == arr[i].length - 1) {
					arr [i][j] = 1;

				} else {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}

	}


}