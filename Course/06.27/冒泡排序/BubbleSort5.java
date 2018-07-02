public class BubbleSort5 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,45,4};
		bubbleSort(arr);
		EarchArray(arr);


	}

	static void bubbleSort(int[] arr) {
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++)
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					
					arr[i + 1] = arr[i];
					arr[i] = temp;
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