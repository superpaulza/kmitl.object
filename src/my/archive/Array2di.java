package my.archive;
import my.*;
public class Array2di {

	public static void main(String[] args) {
		double [][] a = new double[5][6];
		int x = 2;
		//row
		for (int j = 0; j <= 5; j+=2) {
			//col
			for (int i = 0; i <= 4; i++) {
				a[i][j] = my.math.fac(x);
				x++;
			}
		}
		int n = 4;
		//row
		for (int j = 1; j <= 5; j+=2) {
			//col
			for (int i = 0; i <= 4; i++) {
				a[i][j] = my.math.pow(n,2);
				n+=2;
			}
		}
		display(a);
	}
	
	public static void display (double [][] a) {
			//row
		for (int i = 0; i < a.length; i++) {
				//col
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%18.1f \t",a[i][j]);
			}
			System.out.println();
		}
		System.out.print("\n" + "This array get " + a.length + "*" + a[0].length + " dimension");
	}
}
