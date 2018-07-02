public class SelectionSort {

	public static void main(String[] args){

		int[] arr ={5, 6, 3, 2, 1};
		// i决定循环的开始位置,
		int i = 0;
		int mainIndex = i;
		// for循环是局部的,可以重复用 第一轮
		for (int j = 1; j < arr.length; j++) {
			if (arr[mainIndex] > arr[j]) {
				mainIndex = j ;
			}			
		}

		if (mainIndex != i) {
			int temp = arr[i];
			arr[i] = arr[mainIndex];
			arr[mainIndex] = temp;
		}
		// 第二轮
		i = 1;
		mainIndex = i;
		for (int j = 2; j < arr.length; j++) {
			if (arr[mainIndex] > arr[j]) {
				mainIndex = j ;
			}
		}

		if (mainIndex != i) {
			int temp = arr[i];
			arr[i] = arr[mainIndex];
			arr[mainIndex] = temp;
		}
		// 第三轮
		i = 2;
		mainIndex = i;
		for (int j = 3; j < arr.length; j++) {
			if (arr[mainIndex] > arr[j]) {
				mainIndex = j ;
			}
		}

		if (mainIndex != i) {
			int temp = arr[i];
			arr[i] = arr[mainIndex];
			arr[mainIndex] = temp;
		}
		// 第四轮
		i = 3;
		mainIndex = i;
		for (int j = 4; j < arr.length; j++) {
			if (arr[mainIndex] > arr[j]) {
				mainIndex = j;
			}
		}

		if (mainIndex != i) {
			int temp = arr[i];
			arr[i] = arr [mainIndex];
			arr[mainIndex] = temp;
		}






		/*
		// 第一轮
		int mainIndex = i;
		if (arr[mainIndex] > arr[1]) {
			mainIndex = 1;
		} 

		// minIndex = 2;
		if (arr[mainIndex] > arr[2]) {
			mainIndex = 2;
		} 

		// mainTndex = 3;
		if (arr[mainIndex] > arr[3]) {
			mainIndex = 3;
		}
		// mainTndex = 4; 
		if (arr[mainIndex] > arr[4]) {
			mainIndex = 4;
		}

		if (mainIndex != i) {
			int temp = arr[i];
			arr[i] = arr[mainIndex];
			arr[mainIndex] = temp;
		}

		// 第二轮

		int j = 1;
		mainIndex = j;
		if (arr[mainIndex] > arr[2]) {
			mainIndex = 2;
		}

		if (arr[mainIndex] > arr[3]) {
			mainIndex = 3;
		}

		if (arr[mainIndex] > arr[4]) {
			mainIndex = 4;
		}

		if (mainIndex != j) {
			int temp = arr[j];
			arr[j] = arr[mainIndex];
			arr[mainIndex] = temp;
		}

		// 第三轮
		int x = 2;
		mainIndex = x;
		if (arr[mainIndex] > arr[3]) {
			mainIndex = 3;
		}

		if (arr[mainIndex] > arr[4]) {
			mainIndex = 4;
		}

		if (mainIndex != x) {
			int temp = arr[x];
			arr[x] = arr[mainIndex];
			arr[mainIndex] = temp;
		}

		// 第四轮
		int y = 3;
		mainIndex = y;
		if (arr[mainIndex] > arr[4]) {
			mainIndex = 4;
		}

		if (mainIndex != y) {
			int temp = arr[y];
			arr[y]  = arr[mainIndex];
			arr[mainIndex] = temp;
		}
		*/


		eachArray(arr);

		int[] arr2 = {45,67,67,102,43,2,1};
		selectionSort(arr2);
		eachArray(arr2);

	}

	// 选择排序
	public static void selectionSort(int[] arr) {
		for (int i = 0;i < arr.length - 1; i++) {
			int mianIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[mianIndex] > arr[j]) {
					mianIndex = j;
				}
			}

			if (mianIndex != i) {
				int temp = arr[i];
				arr[i] = arr[mianIndex];
				arr[mianIndex] = temp;
			}
		}
	}

	

	// 定义一个函数,记录最小值
	public static void eachArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}


}