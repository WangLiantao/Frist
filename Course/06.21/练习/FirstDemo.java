public class FirstDemo{
	public static void main(String[] args) {
		for (int j = 1;j <= 4;j++) {
			for (int i = 1;i <= 7;i++) {
				if (i <= 4 + j -1&&i >= 4 - (j -1)) {
					System.out.print("*");
				}	 else {
						System.out.print("&");
					}
				
			}
			System.out.println();
		}
		 int n = 10;
		 for (int j = 1;j <= n;j++) {
			for (int i = 1;i <= 2 * n - 1;i++) {
				if (i <= n + j -1&&i >= n - (j -1)) {
					System.out.print("*");
				}	 else {
						System.out.print(" ");
					}
				
			}
			System.out.println();
		}
	}
}
