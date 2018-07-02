// 选择排序
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {1,5,6,2,9,3};
		selectionSort(arr);
		EachArray(arr);


	}

	static void selectionSort(int[] arr) {
		for (int i = 0;i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1;j< arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;

				}
			}

			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
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