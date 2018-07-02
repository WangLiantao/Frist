public class Overload {
 
 	static int sum(int a,int b) {
 		System.out.println("int类型");
 		return a + b;
 	}

 	static float sum(float a, float b) {
 		System.out.println("float类型");
 		return a + b;
 	}
	public static void main(String[] args) {

		int mum = sum(5,6);
		System.out.println(num);

	}

}