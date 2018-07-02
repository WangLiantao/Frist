public class Cs {

	public static void main(String[] ages) {


		for (int a = 0; a < 5;a++) {
			for (int b = 0; b < 5;b++) {
				if(a < 5 || b < 5 ) {
				System.out.print("*");
				}
			}
			System.out.println();
		}




		for (int c = 0; c < 5;c++) {
			for (int d =0; d <=c;d++) {
				System.out.print("*");
			}
			System.out.println();
		}	

		for (int j =0; j < 5; j++) {
			for (int i = 0; i < 2 * 5 - 1; i++) {
				if (i >= 5 - 1 - j && i <= 5 - 1 + j) {
					System.out.print("*");
					// 如果不打印else的内容,虽然打印星的内容区间有限制,但是由于前面没内容,星自动排列变形,会形成一个三角形.
				} else {
					System.out.print(" ");
				} 
			}	
			System.out.println();


	}
	}
}