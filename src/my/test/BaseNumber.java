package my.test;
import java.util.*;

public class BaseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number ==> "); int n = sc.nextInt();
		System.out.print("From Base: "); int x = sc.nextInt();
		System.out.print("To Base: "); int y = sc.nextInt();
		System.out.println("Result: " + BaseXtoY(n,x,y)); 
	}
	
	public static long Base10toX(long n, int x) {
		long y, sum = 0;;
		for(int i = 0; n!=0; i++) {
			y = n % x;
			n = n / x;
			sum = sum + y * (long) Math.pow(10, i);
		}
		return sum; 
	}
	
	public static long BaseXto10(long n, int x) {
		long y, sum = 0;
		for(int i = 0; n!=0; i++) {
			y = n % 10;
			n = n / 10;
			sum = sum + y * (long) Math.pow(x, i);
		}
		return sum; 
	}
	
	public static long BaseXtoY(int n, int x, int y) {
		long a = BaseXto10(n,x);
		long sum = Base10toX(a,y);
		return sum;
	}
	
}
