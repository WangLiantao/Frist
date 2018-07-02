public class YueFen2 {

	public static void main(String[] args) {

	

		System.out.println(yuefen(8,10));
		
	}
	static String yuefen(int mouth,int day ) {
		// 任何一个非系统值都需要定义后才能用
		String a;

		
		if (mouth == 1) {
			if (day > 20) {
			a = "水瓶座";			
		} else { a = "摩羯座";}
		} else if (mouth == 2) {
			if (day > 20) {
				a = "双鱼座";
			} else { a = "水瓶座";}
		} else if (mouth == 3) {
			if (day > 20) {
				a = "白羊座";
			} else { a = "双鱼座";}
		} else if (mouth == 4) {
			if (day > 20) {
				a = "金牛座";
			} else { a = "白羊座";}
		} else if (mouth == 5) {
			if (day > 20) {
				a = "双子座";
			} else { a = "金牛座";}
		} else if (mouth ==6) {
			if (day > 20) {
				a = "巨蟹座";
			} else { a = "双子座";}
		} else if (mouth ==7) {
			if (day > 20) {
				a = "狮子座";
			} else { a = "巨蟹座";}
		} else if (mouth ==8)  {
			if (day > 20) {
				a = "处女座";
			} else { a = "狮子座";}
		} else if (mouth ==9) {
			if (day > 20) {
				a = "天秤座";
			} else { a = "处女座";}
		} else if (mouth ==10) {
			if (day > 20) {
				a = "天蝎座";
			} else { a = "天秤座";}
		} else if (mouth ==11) {
			if (day > 20) {
				a = "射手座";
			} else { a = "天蝎座";}
		} else if (mouth ==12) {
			a = "摩羯座";
		} else {a = "水瓶座";}

		// return以后的值都不再执行,return只执行一个函数
		return a;
		
	}

}	
