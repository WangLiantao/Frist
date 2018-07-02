public class Student {

	int age;
	int score;
	String name;
	String gendenr;

	public void Exam() {

		System.out.println("我是" + name + ",今年" + age + "了,我的性别是" + "我的成绩是" + score + ".");


	}

	public static void main(String[] args) {
		Student p1 = new Student();
		p1.age = 21;
		p1.score = 98;
		p1.name = "李红";
		p1.gendenr = "女";
		// 调用Exam方法
		p1.Exam();

		Student p2 = new Student();
		p2.age = 18;
		p2.score = 78;
		p2.name = "王庆";
		p2.gendenr = "男";
		p2.Exam();

		Student p3 = new Student();
		p3.age = 25;
		p3.score = 99;
		p3.name = "刘志";
		p3.gendenr = "男";
		p3.Exam();

		Student p4 = new Student();
		p4.age = 23;
		p4.score = 80;
		p4.name = "校芳";
		p4.gendenr = "女";
		p4.Exam();

		// 创建对象数组
		Student[] arr = {p1 , p2, p3, p4};

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 -j; i++) {
				// 调用数组中scoure的值进行冒泡排序
				if (arr[i].score < arr[i+1].score) {
					Student temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}

		
		// 遍历数组(不一定要建立方法(之前打印需要才建立方法的))
		for (int j = 0; j < arr.length; j++) {
			// 自定数组名称为Student,因此要用Student
			// 调用Exam函数
			Student p = arr[j];
			p.Exam();

			//调用函数Exam方式2 
			// arr[j].Exam();

			

		}

	}
}