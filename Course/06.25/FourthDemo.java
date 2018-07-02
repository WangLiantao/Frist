public class FourthDemo {

	public static void main(String[] args) {

		int x=10;
		// 调用change函数
		x = change(x);
		// 打印调用函数的值
		System.out.println(x);
	}

	static int change(int x) {
		// 打印结果:10
		System.out.println(x);
		x=20;
		// 打印结果:20
		System.out.println(x);
		// 返回参数x(此时返回的x,为重新赋值)
		return x;
	}


}