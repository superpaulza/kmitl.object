package my.archive;
import java.util.Scanner;

public class HWFactorial4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n ==> ");
		//Create New Object
		MyMath p = new MyMath();
		int n = sc.nextInt();
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {sum = sum - MyMath.fac(i)/MyMath.pow(i, 2);
			System.out.print(" (" + sum + ") " +"-"+i+"!"+"/"+i+"^2");}
			else {sum = sum + p.factorial(i)/MyMath.pow(i, 2);
			System.out.print(" (" + sum + ") " +"+"+i+"!"+"/"+i+"^2");}
		}
		System.out.println("= "+sum);
	}

}