package my.timer;

public class Time1 {

	public static void main(String[] args) {
		convert(3600);
		convert(72,60);
		convert(10,72,3600);
	}
	
	public static void tranform(int s) {
		int hr = s/3600;
		int min = (s%3600)/60;
		int sec = s%60;
		System.out.println(hr+"hr "+min+"min "+sec+"sec");
	}
	
	//---- Overload Method ----\\
	public static void convert(int s) {
		tranform(s);
	}
	
	public static void convert(int m, int s) {
		s = m*60+s;
		tranform(s);
	}
	
	public static void convert(int h, int m, int s) {
		s = h*3600+m*60+s;
		tranform(s);
	}
	
	//--------------------------\\
}
