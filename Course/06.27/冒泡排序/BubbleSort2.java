public class BubbleSort2 {

	public static void main(String[] args){

		int[] arr = {5,6,3,2,1};
		// 调用bubbleSourt(int[] arr)值
		bubbleSort(arr);
		eachArray(arr);

	}

	static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0;j < arr.length - 1 -i; j++)
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		}

	}

	static void eachArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


}