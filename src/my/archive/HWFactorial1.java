package my.archive;
import java.util.Scanner;

public class HWFactorial1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n ==> ");
		int n = sc.nextInt();
		long sum = 0;
		for (int i = 1; i <=n; i++)
			sum = sum + MyMath.fac(i);
		System.out.println(sum);

	}

}
