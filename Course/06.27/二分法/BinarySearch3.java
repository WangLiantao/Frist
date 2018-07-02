public class BinarySearch3 {

	public static void main(String[] args) {

		int[] arr ={1,23,45,67,78,89};
		System.out.println(binarySearch(arr,78));
	}

	// int指的是有返回值int类型
	static int binarySearch(int[] arr,int key) {
		int start = 0;
		int end = arr.length - 1;
		int kIndex = (start + end) / 2;
		while (start <= end) {
			// kIndex只是下标,key是整数两者不能比较
			if (arr[kIndex] < key) {
				// start已经赋值int类型,不用再加int
				start = kIndex + 1;
			} else if (arr[kIndex] > key) {
				end = kIndex - 1;
				// else可以省略判断 优化终止
			} else {
				return kIndex;
			}
			kIndex = (start + end) / 2;					
		}
		// key不存在arr中	 有参有返回值	在子函数内	
		return -1;	
	}
	
}