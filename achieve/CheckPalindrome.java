import java.util.Scanner;
class CheckPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Range (1-) for check Palindrome number ==> ");
		long i = input.nextInt();
		long ans = 0;
		long y,x;

		for(long k = 1; k<=i; k++) {
			x = k;
			for(;x!=0;) {
			y = x%10;
			x = x/10;
			ans = ans*10+y;
			}
		
		//Check is Palindrome
		if (ans == k) {System.out.print(k + " ");}
		ans=0;
		}
		System.out.println();
	}
}
