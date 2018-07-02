// 插入排序
public class InsertionSort2 {

	public static void main(String[] args ) {

		int[] arr = {12,3,456,34,1};
		inertionSort(arr);
		EachArray(arr);

	}

	static void inertionSort(int[] arr) {
		for (int j = 1; j < arr.length; j++) {
			int target = arr[j];
			int i;
			for (i = j; i > 0; i--) {
				if (target < arr[i-1]) {
					arr[i] = arr[i-1];
				} else {
					break;
				}
			}
			arr[i] = target;
		}
	}

	static void EachArray(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}
}