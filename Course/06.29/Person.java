// 公共的类 访问限制修饰符
// 类是具有相同特征和行为的事物的抽象
public class Person {

	// 对象的成员变量(字段)
	// 年龄
	int age;

	// 性别
	String gender;

	// 姓名
	String name;



	// 方法
	public void eat() {
		System.out.println("我的名字叫" + name + ",性别:" +
			gender + ",年龄:" + age + ",喜欢站着吃!");
	}

	public static void main(String[] args) {

		// 初始化一个对象
		// 对象是类的实例化(具体化)
		// 类名 变量名 = new 类名();
		Person p1 = new Person();
		// 通过.语法 可以访问对象的属性和方法
		p1.name = "袁中华";
		p1.age = 26;
		p1.gender = "保密";
		// 调用方法
		p1.eat();

		Person p2 = new Person();
		p2.name = "王迪";
		p2.age = 22;
		p2.gender = "男";
		p2.eat();

		Person p3 = new Person();
		p3.name = "肖阳";
		p3.age = 21;
		p3.gender = "女";
		p3.eat();

		Person p4 = new Person();
		p4.name = "李红";
		p4.age = 19;
		p4.gender = "女";
		p4.eat();

		




	}
}