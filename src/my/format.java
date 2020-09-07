package my;

public class format {

	public static String formText(String x, int p) {
		x = x.trim()+"                          ";
		x = x.substring(0,p);
		return x;
	}

}
