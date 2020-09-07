package my.timer;

public class Time2 {
	
	public static void main(String[] args) {
		print(3600);
		print(72,60);
		print(10,72,3600);
	}
	public static void print(int s) {
		System.out.println(hour(s)+":"+minute(s)+":"+second(s));
	}
	public static void print(int h,int m,int s) {
		s = h*3600+m*60+s;
		System.out.println(hour(s)+":"+minute(s)+":"+second(s));
	}
	public static void print(int m,int s) {
		s = m*60+s;
		System.out.println(hour(s)+":"+minute(s)+":"+second(s));
	}
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
