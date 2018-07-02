public class Ruler {

	String user;
	int time;
	int extent;

	public void Measurement(){

		System.out.println("这个尺子的使用者是" + user +",使用了" + time + "年,长度是" + extent +"cm.");
	}

	public static void main(String[] args) {

		Ruler r1 = new Ruler();
		r1.user = "小红";
		r1.time = 3;
		r1.extent = 100;
		// 对象调用
		r1.Measurement();




	}
}