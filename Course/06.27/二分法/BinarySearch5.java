public class BinarySearch5 {

	public static void main(String[] rges) {

		int[] arr = {1,3,4,5,6,6,33,45,65,67,90};
		System.out.println(binarySearch(arr,6));
	}

	static int binarySearch(int[] arr,int key) {

		int start = 0;
		int end = arr.length - 1;
		// 定义变量kIndex
		int kIndex = (start + end) / 2;

		while (start <= end) {
			if (arr[kIndex] > key){
				end = kIndex -1; 
			} else if (arr[kIndex] < key) { 
				start = kIndex + 1;
			} else {
				return kIndex;
			}
			// 下标等于开始加结束 / 2
			kIndex = (start + end) / 2;
		}

		return -1;


	}
}