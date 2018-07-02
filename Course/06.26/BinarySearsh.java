public class BinarySearsh {

	这里面定义的是全局变量,定义后所有子函数都能用,变量的使用,大括号开始大括号结束

	public static void main(String[] args) {
		// 二分法数组必须是已经排列好的数组
		
		int[] arr ={1,23,45,67,98,156,177,234};
		
		// 调用函数binarySearsh 值要用()
		System.out.println(binarySearsh(arr,1));
		
		
		// 对num赋值
		int num = 23;
		

		// 初始位置
		int start = 0;

		// 结束位置 7
		int end = arr.length - 1;

		// 中间数坐标 (int 取整) 3(8)
		int mIndex = (start + end) /2;
		while (start <= end) {
				if (arr[mIndex] < num) {
					start = mIndex + 1;
				} else if (arr[mIndex] > num) {
					end = mIndex - 1;
				} else {
					break;
				}
				mIndex = (start + end)/2;						
		// 函数执行顺序,从上到从右向左(普遍性)			
		System.out.println("mun的下标为:" + mIndex);
		} 
		// 二分查找法
	}
	// 新建立的函数要在min函数内,与其他函数同级	
	public static int binarySearsh(int[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;
		int mIndex = (start + end) / 2;
		while (start <= end) {
			if (arr[mIndex] < key) {
				start = mIndex + 1;
			} else if (arr[mIndex] > key){
				end = mIndex - 1;
				// else只执行一次 
			} else {
				
				return mIndex;
			}
			mIndex = (start + end) / 2;
		}
		// 没找到
		return -1;
	}

			
}