public class ChengFa2{
	public static void main(String[] args){
		for (int j = 1;j <= 9;j++){
			for (int i =1;i <= j;i++){
				if (i <= j ){
					System.out.print(j + "*" + i + "=" + j * i);
				}

			}
		System.out.println();
		}
	}
}