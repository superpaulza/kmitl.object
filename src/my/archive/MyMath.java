package my.archive;
import java.util.Scanner;

public class MyMath {

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
		int ck = x;
		x = (int) abs(x);
		for (int i = 1; i <= x; i++) fac = fac*i;
		if (cknum(ck)) return fac;
		else return -fac;
		
	}
	
	//Object
	public long factorial (int x) {
		long fac = 1;
		int ck = x;
		x = (int) abs(x);
		for (int i = 1; i <= x; i++) fac = fac*i;
		if (cknum(ck)) return fac;
		else return -fac;
		
	}
	
	public static boolean cknum (double x) {
		if (x >= 0) return true;
		else return false;
	}
	public static double pow (double x, double y) {
		double pow = 1;
		for (int i = 0; i < y ;i++) pow *= x;
		return pow;
	}
	public static String ckoe (int x) {
		if (x % 2 == 0) return "Even";
		else return "Odd";
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x ==> ");
		double x = sc.nextDouble();
		System.out.print("Enter y ==> ");
		double y = sc.nextDouble();
		System.out.println(x + " + " + y + " = " + add(x,y));
		System.out.print(x + " - " + y + " = " + subtrack(x,y) + "\n");
		System.out.printf("%.1f * %.1f = %.1f\n",x,y,multiply(x,y));
		System.out.println(x + " / " + y + " = " + devide(x,y));
		System.out.println(x + " to the power " + y + " is " + pow(x,y));
		System.out.printf("[x] Absolute of %.1f is %.0f \tFactorial of %.1f is %d\n",x,abs(x),x,fac((int) x));	
		System.out.printf("[y] Absolute of %.1f is %.0f \tFactorial of %.1f is %d\n",y,abs(y),y,fac((int) y));	
		System.out.print(x + " is an " + ckoe((int) x) + " Number!");
		System.out.printf(" and %.0f is an %s Number!%n", y,ckoe((int) y));
	}

}
