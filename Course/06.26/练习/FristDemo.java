public class FristDemo {
		static int sum(int a,int b) {
			System.out.println("两个整数和");

			return a + b;
		}
		// 方法重载,两同一不同
		static int sum(int a,int b,int c) {
			System.out.println("三个整数的和");
			
			return a + b + c;
		}
	public static void main(String[] args) {
		int He = sum(78,23);
		int He2 = sum(12,17,22);
		System.out.println(He);
		System.out.println(He2);
	}
}