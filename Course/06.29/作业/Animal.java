public class Animal {


	// 性别
	String gender;
	// 名字
	String name;
	// 颜色/严格区分大小写
	String colour;
	// 年龄
	int age;

	// 建立一个方法eat
	public void eat() {
		System.out.println("我的名字叫" + name + ",性别:" + gender +",年龄:" + age + "岁了,喜欢站着吃!");
	}

	public static void main(String[] args) {
		// 建立一个对象猫
		Animal cat = new Animal();
		cat.name = "li,是一只猫";
		cat.age = 1;
		cat.gender = "母";
		cat.colour = "黄白相间";
		// 调用eat函数
		cat.eat();

		Animal dog = new Animal();
		dog.name = "king,是一条狗";
		dog.age = 2;
		dog.gender = "公";
		dog.colour = "黑色";
		dog.eat();

		Animal bird = new Animal();
		bird.name = "lick,是一只鸟";
		bird.age = 1;
		bird.gender = "公";
		bird.colour = "白色";
		bird.eat();


	}
}