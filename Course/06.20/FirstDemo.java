 public class FirstDemo {

 	public static void main(String[] args) {

		// System.out.print("*");
		// System.out.print("*");
		// System.out.print("*");
		
 		// 例子1
 		// for (int j = 1; j <= 5; j++){

 		// 	for (int i = 1; i <= 9; i++) {

			// 	// System.out.print("*");
			// 	// ||(或)
			// 	// &&(且)
			// 	if (i >=6 - j && i <= 10 - j) {System.out.print("*");}
			// 	else{System.out.print(" ");}
	 	// 	}
	 	// 	System.out.println();

 		// }
 		// 例子4
 		int n = 5; 
 		for (int j = 1;j <= 2 * n - 1; j++) {
 			for (int i = 1; i <=2 * n - 1;i++){
 				// 上半部分三角形
 				if(j <= n) {
 					if (i >= n - (j - 1) && i<= n + j - 1){
 						System.out.print("*");
 					}else {
 						System.out.print(" ");
 					}
 					// 下半部分三角形
 				}


 				else {
 					


	 				if (i >= n - (2 * n - 1 - j) && i <= n + (2 * n - 1 -j)){
	 					System.out.print("*");
	 				}
	 				else {
	 					System.out.print(" ");
	 				}
 				}	
 			}System.out.println();
 		}
 	 }
 	}