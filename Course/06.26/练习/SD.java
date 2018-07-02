public class SD {

	public static void main(String[] args){

		int arr[] ={1,3,5,7,12,34,56,78,90,123};
	System.out.println(BinarySearch(arr,123));
	}

	static int BinarySearch(int arr[],int key) {

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
			mIndex = (start + end) /2;
		}
		return -1;
	}	
}