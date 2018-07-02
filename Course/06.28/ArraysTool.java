// 调用java库
import java.util.Arrays;
public class ArraysTool {

	public static void main(String[] args) {
		// 注意:需要在已经排列好的数组
		byte[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		// 5默认int类型,要进行赋值
		byte n = 5;
		int r = Arrays.binarySearch(arr,n);
		System.out.println(r);
		// 在数组中搜索指定的 byte 型数组的范围，以获得指定的值。(一般只包含开始不包含结尾)
		r = Arrays.binarySearch(arr,1,6,n);
		System.out.println(r);
		// 在数组中查找下标
		byte a = 6;
		r = Arrays.binarySearch(arr,a);
		System.out.println(n);
		// 复制数组,并打印新数组  toString:将数组转换为String类型
		byte[] arrA = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arrA));
		// 创建数组arrB
		int[] arrB = {1,23,45,67,88,33,66,38};
		// 调用方法sort
		Arrays.sort(arrB);
		System.out.println(Arrays.toString(arrB));
		// 创建数组arr1和arr2
		int[] arr1 = {1,3,4,5,6};
		int[] arr2 = {1,3,4,5,6};
		// 调用方法equals 并对返回值类型进行打印(flag进行接收)
		boolean flag = Arrays.equals(arr1,arr2);
		System.out.println(flag);

	}
}