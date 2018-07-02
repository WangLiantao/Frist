public class Sa{
	public static void main(String[] args){
		

	
		
		float d = 123 +1.1F + 99L + 3.14f;
		System.out.println(d);

		byte b = 22;
		byte c = (byte)(b + 11);
		System.out.println(c);
		// 结果是:intMax + 1 = -2147483648
		int intMax = 2147483647;
		intMax = intMax + 1;
		System.out.println("intMax + 1=" + intMax);
		// 结果是:x=11,y=10;
		int x =10;
		int y =x++;
		System.out.println("x=" +x +",y=" +y);
		// 结果是:x1=11,y1=11;
		int x1 =10;
		int y1 =++x1;		
		System.out.println("x1=" +x1 +",y1=" +y1);
		// 第3行错误
		int a,b1,c1;
		a = b1 = c1 =5;
		short s = 5;
		// 错误的:s = s +3;
		// 整数short s = s+3(3位int整数类型需要强制转换)
		s =(short)(s + 3);
		// 整数shourt s + shourt 3
		s +=3;
		// 5+3+3=11
		System.out.println(s);
	}	

}