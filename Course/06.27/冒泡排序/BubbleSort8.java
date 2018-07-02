public class BubbleSort8 {

	public static void main(String[] args){

		int[] arr = {12,34,2,45,1};
		bubbleSort(arr);
		EarchArray(arr);
	}

	static void bubbleSort(int[] arr) {
		for (int j = 0;j < arr.length - 1; j++) {
			for(int i = 0;i < arr.length - 1 -j; i++) {
				if (arr[i + 1] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	static void EarchArray(int[] arr) {
		for (int j = 0;j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}
}