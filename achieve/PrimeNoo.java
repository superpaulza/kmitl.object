import java.util.Scanner;
class PrimeNoo
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Number = ");
		int a = input.nextInt();
		for(int n = 1; n<=a; n++) {
			boolean b = false;
			if (n == 1) b = true;
				for(int i = 2; i<n; i++) {
				if (n%i == 0) b = true;
			}
		if(b) System.out.println(n + " isn't prime no");
		else System.out.println(n + " is prime no");
		}

	}
}
