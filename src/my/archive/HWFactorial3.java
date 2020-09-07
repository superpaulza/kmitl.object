package my.archive;
import java.util.Scanner;

public class HWFactorial3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n => "); int n = input.nextInt();
		double sum = 0;
		for (int i = 2; i <= n; i++) {
			sum = sum + MyMath.fac(i)/MyMath.pow(i, 2);
			System.out.printf("(%f) +%d/%d^2 ",sum,i,i);
		}
		
		System.out.print("\n"+sum);
	}

}
