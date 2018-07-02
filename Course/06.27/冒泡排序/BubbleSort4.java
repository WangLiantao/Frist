public class BubbleSort4 {

	public static void main(String[] args) {

		int[] arr = {2,6,7,1,3};
		bubbleSort(arr);
		EarchArray(arr);


	}

	static void bubbleSort(int[] arr) {
		for (int j = 0; j < arr.length - 1; j++) {
			// 局部变量i下面也要使用  ;相当于.会阻断i的变量传递
			for (int i = 0; i < arr.length - 1 - j; i++)
				// 小换大升序排列(大换小降序排列)
			if (arr[i] < arr[i +1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}


	}

	static void EarchArray(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}
}