public class BubbleSort6 {

	public static void main(String[] args) {

		int[] arr = {1,3,6,8,2,7};
		bubbleSort(arr);
		EarchArray(arr);


	} 

	static void bubbleSort(int[] arr) {

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 -j; i++) {
				// 小换大降序排列
				if (arr[i] < arr[i+1]) {

					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
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