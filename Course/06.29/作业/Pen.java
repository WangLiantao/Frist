public class Pen {

	String user;
	String colour;
	int time;


	public void Write() {
		System.out.println("这个钢笔的使用者是" + user + ",使用了" + time + "年,颜色是" + colour);
	}


	public static void main(String[] args) {

		Pen p1 = new Pen();
		p1.user = "小红";
		p1.time = 2;
		p1.colour= "金色";
		p1.Write();





	}
}