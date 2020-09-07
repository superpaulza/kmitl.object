package my;

public class time {
	public static void printtranform(int s) {
		int hr = s/3600;
		int min = (s%3600)/60;
		int sec = s%60;
		System.out.println(hr+"hr "+min+"min "+sec+"sec");
	}
	//---- Overload Method ----\\
	public static void convert(int s) {
		printtranform(s);
	}
	
	public static void convert(int m, int s) {
		s = m*60+s;
		printtranform(s);
	}
	
	public static void convert(int h, int m, int s) {
		s = h*3600+m*60+s;
		printtranform(s);
	}
	
	//--------------------------\\
	
	public static int hour(int s) {
		return s/3600;
	}
	public static int minute(int s) {
		return s%3600/60;
	}
	public static int second(int s) {
		return s%60;
	}
}
