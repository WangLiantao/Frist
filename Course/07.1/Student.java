// 创建类
public class Student {
		// 年纪
		int age;
		// 成绩
		int grade;
		// 名字
		String name;
		// 性别
		String gender;

		// 构造器:特点与当前所在类名称相同,禁止定义返回值,不需要使用ruturn,构造器其实是有返回值的,返回的是当前创建对象的引用
	public Student(String name, String gender, int age, int grade) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.grade = grade;

	}

	// 建立一个speak的方法
	public void speak() {
		System.out.println("我是" + name + ",我是" + gender + ",今年" + age +"岁了,我成绩是" + grade + ".");

	}

	// 建立main函数入口
	public static void main(String[] args) {
		// 创建对象并写入对应的参数
		Student p1 = new Student("小红","女性",22,89);
		Student p2 = new Student("小明","男性",21,76);
		Student p3 = new Student("李刚","男性",20,89);
		Student p4 = new Student("王志","男性",19,93);
		Student p5 = new Student("李霞","女性",19,75);
		Student p6 = new Student("李红","女性",18,75);
		// 建立对象数组
		Student[] arr = {p1, p2, p3, p4, p5, p6};
		// 采用冒泡排序通过参数grade的高低进行排序
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i].grade < arr[i+1].grade) {
					Student temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					// ==既是等的意思
				} else if (arr[i].grade == arr[i+1].grade) {
					 if (arr[i].age > arr[i+1].age) {
						Student temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
					} 

				}
			}
		}
		// 遍历数组
		for (int j = 0; j < arr.length; j++) {

			Student p = arr[j];
			// 调用方法speak
			p.speak();
		}		

	}




}



