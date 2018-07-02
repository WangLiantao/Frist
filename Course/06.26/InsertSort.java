public class InsertSort {

	public static void main(String[] args) {

		// 插入排序
		int [] arr = {6,5,3,1,2};
		int [] arr2 = {12,34,56,23,67,89};
		/*
		// 第一轮(排除自身的比较) 比较1次
		int i = 1;
		// 定义全局变量j
		int j;
		int target = arr[i];
		// 已经定义j的类型里面不需要再定义了
		for (j = i; j > 0; j--) {
			if (target < arr[j-1]) {
				arr[j] = arr[j-1];
			} else {
				break;
			}
		}
		arr[j] = target;

		// 第二轮 {5,6,3,1,2}
		i = 2;
		target = arr[i];
		// 该判断决定比较几次
		for (j = i;j > 0;j--) {
			if (target < arr[j-1]) {
				arr[j] = arr[j-1];
			} else {
				break;
			}
		}
		arr[j] = target;

		// 第三轮 
		i = 3;
		target = arr[i];
		for (j = i;j > 0;j--) {
			if (target < arr[j-1]) {
				arr[j] = arr [j-1];
			} else {
				break;
			}
		}
		arr[j] = target;

		// 第四轮
		i = 4;
		target = arr[i];
		for (j = i;j > 0;j--) {
			if (target < arr[j-1]) {
				arr[j] = arr [j-1];
			} else {
				break;
			}

		}
		arr[j] = target;
		*/
		// 插入排序

		// main函数才能识别
		insertSort(arr);
		eachArray(arr);
		insertSort(arr2);
		eachArray(arr2);
	}
		// 插入排序
		static void insertSort(int[] arr) {
			for (int i = 1; i < arr.length; i++) {
				
				
				for (int j = i; j > 0; j--) {
					int target = arr[i];
					if (target < arr[j-1]) {
						arr[j] = arr[j-1];
					} else {
						break;
					}
				}
				arr[j] = target;
			}
		}

		

	// 遍历数组函数
	public static void eachArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}