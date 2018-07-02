public class BubbleSort3 {

	public static void main(String[] args) {
		int[] arr = {1,2,5,7,3};
		bubbleSort(arr);
		EachArray(arr);

	}

	static void bubbleSort(int[] arr) {
		// 外循环壤扩内循环要将其包裹在里面
		for (int j = 0;j < arr.length - 1; j++) {
			// 第一轮四次第二轮三次第三轮两次第四轮一次
			for (int i = 0;i < arr.length - 1 - j; i++) 
				// if固定写法 (条件成立运行if,交换.不成立不运行if不交换)
				if (arr[i] > arr[i + 1]) {
					// 进行交换
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			
		}

	}

	// 遍历数组
	static void EachArray(int[] arr) {
		for (int i = 0;i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// 换行作用:和路径进形换行
		System.out.println();
	}

}