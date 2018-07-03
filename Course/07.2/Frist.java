public class Frist {

	// 构建全局变量(成员)fristAge
	int fristAge;
	// 建立构造器  构造器就一个参数name
	public Frist(String name){

		System.out.println("小狗的名字是:" + name);
		
	}
	// 建立一个无返回值方法setAge   fristAge = age
	public void setAge(int age) {
		fristAge = age;
	}

	// 建立一个有int返回值方法genAge  返回全局变量fristAge
	public int getAge() {
		System.out.println("小狗的年龄为:" + fristAge);
		return fristAge;

	}

	// 入口main函数
	public static void main(String[] args) {
		// 建立对象myPuppy
		Frist myPuppy = new Frist("tommy");
		// 通过方法来设定age
		myPuppy.setAge( 2);
		// 调用另一个方法
		myPuppy.getAge( );
		// 访问成员变量(全局变量)
		System.out.println("变量值:" + myPuppy.fristAge);
	}


}