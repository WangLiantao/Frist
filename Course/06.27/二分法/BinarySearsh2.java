public class BinarySearsh2 {

	public static void main(String[] args) {
		int[] arr = {1,23,45,66};
		System.out.println(binarySearsh(arr,45));

	}

	// ;相当于平时用的句号,错误缺少方法主题,改罢错误后立即编译
	static int binarySearsh(int[] arr,int key) {
		int start = 0;
		int end = arr.length - 1;
		int mIndex = (start + end) / 2;
		while (start <= end) {
			if (arr[mIndex] < key) {
				start = mIndex + 1;
			} else if (arr[mIndex] > key) {
				end = mIndex -1;
			} else {
				return mIndex;
			}
			mIndex = (start + end) / 2;
		}
		return -1;

	}

}