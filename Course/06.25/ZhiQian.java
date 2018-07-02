public class ZhiQian {

	public static void main(String[] args) {

		// 方法一(笨)
		/*
		int[]scores={60,80,90,70,85};
		double avg;
		avg = (scores[0] + scores[1] + scores[2] + scores[3] + scores[4])/5;
		System.out.println(avg);
	*/

		// 方法二
		int[]scores={60,80,90,70,85};
		int sum =0;
		double avg;
		for(int i=0;i< scores.length;i++){
			sum = sum + scores[i];
		}
		avg = sum/scores.length;
		System.out.println(avg);
	}
}