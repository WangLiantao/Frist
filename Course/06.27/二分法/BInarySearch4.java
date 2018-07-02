public class BInarySearch4 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9};
		// 调用函数
		System.out.println(binarySearch(arr,8));

	}

	static int binarySearch(int[] arr,int key) {

		int start = 0;
		int end = arr.length - 1;
		int kIndex = (start + end) / 2;
		// 开始小于结尾
		while (start <= end) {
			// kIndex只是下标,key是整数两者不能比较		
			if (key < arr[kIndex]) {
				end = kIndex - 1;
			} else if(key > arr[kIndex]) {
				start = kIndex + 1 ;
			} else {
				return kIndex;
			}

			kIndex = (start + end) / 2;
		} 
		return -1;

	}

}