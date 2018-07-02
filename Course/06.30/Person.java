public class Person {

	// 姓名
	public String name;
	// 性别
	public String gender;
	// 年龄
	public int age;

	// 默认void类型,默认构造器 名字必须要和名称相同(一般省略)
	public Person() {
		System.out.println("构造器方法");
	}

	// 构造方法的重载
	public Person(String name, String gender, int age) {

		// 就近原则赋的形参的值: 形参 = 赋值
		// name = "name";

		// 形参和字段名一致时,this不能省略
		// this是构造出来的对象的引用(代表new出来的对象)
		this.name = name;
		this.gender = gender;
		this.age = age;


	}

	// 构造方法
	public void speak() {
		// this可以省略
		System.out.println("姓名:" + this.name + ",性别:" + this.gender + ",年龄:" + this.age);
	}

	// public是修饰符(公共的常见)
	public static void main(String[] args) {



		Person p1 = new Person();
		Person p2 = new Person("小明","男",20);
		p2.speak();
		System.out.println(p2.name);
		// System.out.println(name);

	}
}