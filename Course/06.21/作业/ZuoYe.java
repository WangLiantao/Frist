public class ZuoYe{
	public static void main(String[] args){
			// *形状直角三角形,5行5列
		for (int j = 1;j <=5;j++){
			for (int i = 1;i <=5;i++)
				if (i <= j){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
		System.out.println();
		} 
		// *形状直角三角形,5行j列
		for (int j = 1;j <=5;j++){
			for (int i = 1;i <=j;i++)
				if (i <= j){
					System.out.print("*");
				} 
		System.out.println();
		} 
		// 乘法口绝,9行j列
		for (int j = 1;j <=9;j++){
			for (int i = 1;i <=j;i++)
				if (i <= j){
					System.out.print(j + "*" + i + "=" + j * i);
				} 
		System.out.println();
		} 



	}
}