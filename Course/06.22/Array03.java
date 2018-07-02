public class Array03 {
	// args:参数
	public static void main(String[] args){

	int[] arr1 = {1 ,2 ,3 ,4};
	int[] arr2 = {5 ,6 ,7 ,8};
	// 获取数组的长度
	int length = arr1.length;

	int[] arr3 = new int[length];

	for (int i = 0; i < length; i++) {

		arr3[i] = arr1[i] + arr2[i];
		System.out.println("arr3[" + i + "]=" + arr3[i]);
	}

	int[] arr4 = new int[length];
	for (int i = 0; i < length; i++) {
		// arr4[0] = arr3[3]
		// arr3[1] = arr2[2]
		// arr2[2] = arr1[1]
		// arr1[3] = arr0[4]
		arr4[i] = arr3[length - 1 - i];
	}

	// 作业:学过的代码敲一遍
	// 拓展题:如何交换两个变量的值,如何交换数组中两个位置上的元素值
	// 拓展:通过控制台输入数字并把数字放到数组中,
	// 乘法口诀10遍
	// 特殊判断一个年份是平年还是瑞年
	// 判断一个日期的星座

	}
}