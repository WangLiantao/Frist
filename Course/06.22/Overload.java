public class Overload {
 
 	static int sum(int a,int b) {
 		System.out.println("int类型");
 		return a + b;
 	}

	static int sum(int a,int b,int c) {
 		System.out.println("3个整型");
 		return a + b + c;
 	}





 	// 方法重载,两同一不同
 	// 同类中
 	// 方法名相同
 	// 参数个数不同或类型不同或顺序不同
 	// 注意:跟返回值无关

 	static float sum(float a, float b) {
 		System.out.println("float类型");
 		return a + b;
 	}

	public static void main(String[] args) {
		int num = sum(5,6,7);
		System.out.println(num);

		// double a = 4ez0 + 5E10;

		


	}

}