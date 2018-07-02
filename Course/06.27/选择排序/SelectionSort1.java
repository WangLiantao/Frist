public class SelectionSort1 {

	public static void main(String[] args) {
		int[] arr = {1,4,5,6,2};
		selectionSort(arr);
		EachArray(arr);
	}

	static void selectionSort(int[] arr) {
		for (int i = 0;i < arr.length - 1; i++) {
			int mainIndex = i;
			for (int j = i + 1;j < arr.length; j++) {
				if (arr[mainIndex] < arr[j]) {
					mainIndex = j;
				}
			}
			if (mainIndex != i) {
				int temp = arr[i];
				arr[i] = arr[mainIndex];
				arr[mainIndex] = temp;
			}
		}
	}
	static void EachArray(int[] arr) {
		for (int i = 0;i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}