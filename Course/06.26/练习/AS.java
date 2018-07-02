public class AS {

	public static void main(String[] args) {

		int[] arr ={1,34,45,124,566,645,667,722,1555,2223};
		System.out.println(binarySearch(arr,34));
	}
	// 二分查找:binarySearch
	static int binarySearch(int[] arr,int key){

		int start = 0;
		int end = arr.length - 1;
		int mIndex = (start + end) / 2;
		while (start <= end) {
			if (arr[mIndex] < key) {
				start = mIndex + 1;
			} else if (arr[mIndex] > key){
				end = mIndex - 1;
			} else {
				return mIndex;
			}
			mIndex = (start + end) / 2;
		}
		return -1;

	}

}