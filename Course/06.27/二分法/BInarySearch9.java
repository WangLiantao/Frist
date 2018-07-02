public class BinarySearch9 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9};
		// 8 不用再加int
		System.out.println(binarySearch(arr, 8));

	}

	static int binarySearch(int[] arr,int key) {
		int start = 0;
		int end = arr.length - 1;
		int kIndex = (start + end) / 2;
		while (start <= end) {
			if (arr[kIndex] > key) {
			end = kIndex - 1;
		} else if (arr[kIndex] < key) {
			start = kIndex + 1;
		} else {
			return kIndex;
		}
		kIndex = (start + end ) / 2;
	}
		return - 1;
	}
}