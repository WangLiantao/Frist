public class Print {

	public static void main(String[] args) {

		int i = 1;

		while (i <= 100) {
			System.out.println("第" + i + "遍写:你是我的眼!");
			i++;
		}

		for (int j = 0;j < 100; j++) {
			System.out.println("第" + (j + 1) + "编写:你是我的翅膀!");
		}
	}
}