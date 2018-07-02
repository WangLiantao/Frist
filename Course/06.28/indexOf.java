public class indexOf {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,5,4,3,8};
		System.out.println(EachArray(arr,4));
		System.out.println(reverse(arr));
		
		// 调用getMax方法
		int a = getMax(arr);
		System.out.println(a);

		int[] arr4 = arrayCopy(arr,1,5);
		// 打印数组要遍历数组
		eachArray(arr4);


	}

	// 遍历数组

	static void eachArray(int[] arr) {
		for (int i = 0;i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	// 查找下标
	static int EachArray(int[] arr,int key) {

		// for (int i = 0; i < arr.length; i++) {
		// 	while (arr[i] != key) {
		// 		for (int j = 0;j < arr.length - 1 -i; j++) {
		// 			int temp = arr[i];
		// 			arr[i] = arr[i + 1];
		// 			arr[i +1] = temp;
		// 		}
		// 	} return  j;
		// return -1;
		// }

		for (int i = 0; i < arr.length; i++) {			
			if (arr[i] == key) {
			return i;	
			}						
		}
		return - 1;
		
	}
	//逆序
	public static int reverse(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			min = min < arr[i] ? min :arr[i];
		}
		return min;
	}

	 
	// getMax
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			// max = max > arr[i] ? max : arr[i];
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// getMin
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			min = min < arr[i] ? min :arr[i];
		}
		return min;
	}

	// arrayCopy
	/**
	*param1 要拷贝的数组
	*param2 拷贝的开始位置(包含)
	*param3 拷贝的结束位置(不包含)
	*return 返回新的数组
	*/
	public static int[] arrayCopy(int[] arr, int start, int end) {
		if (start < 0 || end < 0 || start >= end) return arr;

		int[] newArr = new int[end - start];
		// 新旧下标
		int i = 0;
		int j = 0;
		for (i = start; i < end; i++) {
			newArr[j++] = arr[i];

		}
		return newArr;


	}








}