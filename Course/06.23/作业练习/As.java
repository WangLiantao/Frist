public class As {

	public static void main (String[] agrs) {

		int p =86;
		// if和else对应,如果要有多个判断,用if和else需要配合,if和if else(多个).
		
		if(p >=90) {
			System.out.println("优");
		} else if(p >=80) {
			System.out.println("良");
		} else if(p >=70) {
			System.out.println("中");
		} else if(p <70){
			System.out.println("多多努力");
		}



		double a =2.134444;
		int b = (int)a;
		if (a - b >= 0.5) {
		System.out.println(a + "四舍五入是" + (b +1));
		} else {
			System.out.println(a + "四舍五入是" + b);
		}

	}
}