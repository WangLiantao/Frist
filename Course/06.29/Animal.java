public class Animal {

	String age;

	String gender;

	String name;

	String colour;


	public void eat() {
		System.out.println("我的名字叫" + name + ",性别:" + gender +",年龄:" + age + ",喜欢站着吃");
		System.out.println("我的名字叫" + name + ",性别:" + gender +",颜色:" + colour + ",喜欢站着吃");

	}



	public static void main(String[] args) {


		Animal cat = new Animal();
		cat.name = "Li,是一只猫";
		cat.age = "1岁";
		cat.gender = "公";
		cat.colour = "黄白相间";
		cat.eat();
		

		Animal dog = new Animal();
		dog.name = "Hid,是一条狗";
		dog.age = "2岁";
		dog.gender = "母";
		dog.colour = "黑色";
		dog.eat();

		




	}
}