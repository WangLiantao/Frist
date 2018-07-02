public class Person {

	// 全局变量
	int age ;
	String name;
	String gendenr;

	public void xinxi() {
		System.out.println("我是" + name + ",今年" + age + "了," + gendenr);
	}

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.age = 26;
		p1.name = "李强";
		p1.gendenr = "男";
		p1.xinxi();


	}
}