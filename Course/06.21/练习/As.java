public class As {
	public static void main(String[] args){
		// 字符串与整型的组合  从左之右进行
		// System.out.println(8+7+"Hello"); 结果=15Hello(字符串)
		// System.out.println("Hello"+7+8); 结果=Hello78(字符串)
		// System.out.println(7+"Hello"+8); 结果=7Hellow8(字符串)
		// String str=17+"ABC";定义str
		// System.out.println(str);结果打印str  显示效果 17ABC
		
		/*byte b=22;
		b=(byte)(b+11);
		System.out.println(b);
		int c=22;
		c=c+11;
		System.out.println(c);
		double d=1.5;
		d=d+1.6;
		System.out.println(d);*/

		/*int intMax=2147483647;
		intMax=intMax+2;
		System.out.println("intMax+1=" + intMax);
		String e="ABC";
		System.out.println(e);*/
		// 创建一个猫,并给他一块地方
		Cat c1 = new Cat();
		c1.info();
	}
}		

		class Cat{
			String type ="波斯猫";
			int age = 1;
			public void info(){
				System.out.println("我是" + type+ "今年" + age +"岁了!");
			}
		}

	

