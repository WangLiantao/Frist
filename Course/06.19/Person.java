public class Person{

	public static void main(String[] args) {
	// int data = 5;
	// System.out.println(data);
	Cat c1 = new Cat ();
	// 建立一个地方(内存)
	c1.info();
	}

}

class Cat {
	String type = "波斯猫";
	int age = 1;
	public void info() {
		System.out.println("我是" + type + ", 我今年" + age + "岁了!");
	}
}