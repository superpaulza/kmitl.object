import java.util.Scanner;
class PrimeNo
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Number = ");
		int a = input.nextInt();
			if (a == 1) {System.out.println(a + " isn't prime no");
						 return; }
		for(int n = 2; n<a; n++) {
			if (a%n == 0) { System.out.println(a + " isn't prime no");
							return; }
		}
		System.out.println(a + " is prime no");
		
	}
}
