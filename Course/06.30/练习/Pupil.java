public class Pupil {

	int age;
	int grade;
	String name;
	String gender;

	// 构造器
	public Pupil(int age, int grade, String name, String gender) {
		this.age = age;
		this.grade = grade;
		this.name = name;
		this.gender = gender;
	}

	// 方法
	public void Student() {
		System.out.println("我是" + name + ",我今年" + age + "了,我的性别是" + gender + "我的成绩是" + grade + "分.");
	}

	// 入口函数mian 
	public static void main(String[] args) {

		// 创建对象
		Pupil p1 = new Pupil(19,89,"李强","男");
		Pupil p2 = new Pupil(22,99,"王芳","女");
		Pupil p3 = new Pupil(18,67,"刘庆","男");
		Pupil p4 = new Pupil(25,75,"王丽","女");
		// 创建数组
		Pupil[] arr = {p1 ,p2 ,p3 ,p4};

		bubleSort(arr);
		for(int i = 0; i < arr.length; i++) {
			arr[i].Student();
		}

		// p1.Student();
		// p2.Student();

	}

	public static void bubleSort(Pupil[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 -i; j++) {
				// 调用数组元素: 下标.属性
				if (arr[j].grade < arr[j+1].grade) {
					// 交换变量cd
					Pupil temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}






