public class Botany {

	String age;
	String name;
	int gao;
	int wide;





	public static void main(String[] args) {

		// 创建一个Lishu   类名 + 名 = new 类名 + ();  
		Botany lishu = new Botany();
		lishu.age = "1岁";
		lishu.name = "梨树";
		lishu.gao = 3;
		lishu.wide = 1;
		lishu.look();



	}


	public void look() {
		System.out.println("我是一棵" + name + ",今年" + age + "了," + "高" + gao +  "米宽" + wide + "米." );

	}
}