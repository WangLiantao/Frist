public class ArrayUtil {

	public static void main(String[] args) {

		int[] arr = {5, 2, 3, 4, 8};
		print(arr);
		reverse(arr);
		print(arr);



	}

	public static void print(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	// 倒叙
	public static void reverse(int[] arr) {
		// 两次循环
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
					
		}
		

		// for (int i = arr.length; i > 0; i--) {
		// 	System.out.print(arr[i] + " ");
		// }
		// System.out.println(); 

	}

}