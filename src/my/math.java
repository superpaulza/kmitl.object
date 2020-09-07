package my;
import java.util.Scanner;

public class math {

	public static double add (double x, double y) {
		return x + y;
	}
	
	public static double subtrack (double x, double y) {
		return x - y;
	}
	public static double multiply (double x, double y) {
		return x * y;
	} 
	public static double devide (double x, double y) {
		return x / y;
	}
	public static double abs (double x) {
		if (cknum(x)) return x;
		else return x*-1;
	}
	public static long fac (int x) {
		long fac = 1;
		double ck = x;
		x = (int) abs(x);
		for (int i = 1; i <= x; i++) fac = fac*i;
		if (cknum(ck)) return fac;
		else return -fac;
		
	}
	
	// --- Object (No have "static")
	public long factorial (int x) {
		long fac = 1;
		double ck = x;
		x = (int) abs(x);
		for (int i = 1; i <= x; i++) fac = fac*i;
		if (cknum(ck)) return fac;
		else return -fac;
		
	}
	// ---
	
	// --- Overloading (Same method's name but different return value or number of input data)
	public static boolean cknum (double x) {
		if (x >= 0) return true;
		else return false;
	}
	
	public static String cknum (int x) {
		if (x % 2 == 0) return "Even";
		else return "Odd";
	}
	// ---
	
	public static double pow (double x, double y) {
		double pow = 1;
		for (int i = 0; i < y ;i++) pow *= x;
		return pow;
	}

	public static boolean prime(int n) {
			if (n == 1) return false;
		for(int i = 2; i<n; i++) {
			if (n%i == 0) return false;
		}
		return true;
	}
	
	public static boolean palindrome (int n) {
		int ans = 0,x,y;
		y = n;
		for (;n!=0;) {
			x = n%10;
			n = n/10;
			ans = ans*10+x;
		}
		if (ans == y) return true;
		else return false;
	}
	
	public static int GCD (int a,int b) {
		int i = a; int j = b; int k = 0;
		//find GCD
			for(;j!=0;) {
				k = j;
				j = i%j;
				i = k;
			}
		return k;
		}
	
	public static int LCM (int a,int b) {
		int k = GCD(a,b);
		int l = (a*b)/k;
		return l;
		}
}
