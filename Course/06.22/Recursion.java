public class Recursion {

	// 递归函数
	// 在函数内部直接或间接的调用函数本身(调用同名函数)
	static int resur(int n) {

		// 给一个出口
		if (n <= 1) {
			return 1;
		}

		return n * resur(n - 1);
	}

	static int func(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;

		return func(n - 1) + func( n - 2); 
	}

	static int sum(int n) {
		if (n <= 0) return n;
		return n + sum(n - 1);
	}

	static int dh(int n) {
		if (n <= 0) return 0;
		return n * sum(n - 1);
	}



	public static void main(String[] args) {

		int result = resur(5);
		System.out.println(result);

		result = func(20);
		System.out.println(result);

		result = sum(10);
		System.out.println(result);

		result = dh(10);
		System.out.println(result);



	}
	
}