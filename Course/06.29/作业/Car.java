public class Car {

	String name;
	double age;
	String colour;

	public void run() {
		System.out.println("车的名字是" + name +",使用年限" + age +"年,颜色是" + colour);
	}

	public static void main(String[] args) {

		Car dazhong = new Car();
		dazhong.name = "大众";
		dazhong.age = 20.5;
		dazhong.colour = "黑色";
		dazhong.run();

		Car xuefulan = new Car();
		xuefulan.name = "雪佛兰";
		xuefulan.age = 15;
		xuefulan.colour = "白色";
		xuefulan.run();

		Car lanbojini = new Car();
		lanbojini.name = "兰博基尼";
		lanbojini.age = 55;
		lanbojini.colour = "红色";
		lanbojini.run();


	}
}