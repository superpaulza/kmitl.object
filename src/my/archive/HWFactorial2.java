package my.archive;
import java.util.Scanner;

public class HWFactorial2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n ==> ");
		int n = sc.nextInt();
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {sum = sum - MyMath.fac(i);
			System.out.print("-"+i+"!");}
			else {sum = sum + MyMath.fac(i);
			System.out.print("+"+i+"!");}
		}
		System.out.println("= "+sum);
	}

}