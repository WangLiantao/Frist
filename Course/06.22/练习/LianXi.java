public class LianXi {
	public static void main(String[] args){
		int x1 = 10;
		// 设y1等于10;
		int y1 = x1++;
		// y1等于10加1,运行x1加1;
		System.out.println("x1=" +x1 +",y1=" +y1);



		int x = 3;
		int C = ++x + x++ + ++x;
		System.out.println(C);
		int x2 = 10;
		int y2 = ++x2;
		System.out.println("x2=" +x2+ ",y2=" +y2);

	}
}