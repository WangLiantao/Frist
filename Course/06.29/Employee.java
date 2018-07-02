public class Employee {

	// 姓名
	String name;
	// 性别
	String gender;
	// 年龄
	int age;
	// 工资
	int salary;


	// 建立一个介绍函数
	public void introdeuce() {
		// 打印输出
		String info = "我叫" + name + ",今年" + age + "岁了," + "性别" + gender + ",一个月工资" + salary + "元";
		System.out.println(info);



	}

	public static void main(String[] args){
		// 创建一个员工对象
		Employee e1 = new Employee();
		// 给员工对象添加姓名
		e1.name = "王刚";
		// 添加年龄
		e1.age = 20;
		// 添加性别
		e1.gender = "男";
		// 添加工资
		e1.salary = 9000;

		Employee e2 = new Employee();
		e2.name = "张强";
		e2.age = 25;
		e2.gender = "男";
		e2.salary = 6000;

		Employee e3 = new Employee();
		e3.name = "圆圆";
		e3.age = 18;
		e3.gender = "女";
		e3.salary = 16000;
		// 将对象放到数组中
		Employee[] arr = {e1, e2, e3};

		// 根据工资排序
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// 调工资参数
				if (arr[j].salary > arr[j + 1].salary) {
					Employee temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// 遍历数组
		for (int i = 0; i < arr.length; i++) {
			// 定义变量Employee
			Employee e = arr[i];
			// 调用函数introdeuce
			e.introdeuce();
		}

	}
}