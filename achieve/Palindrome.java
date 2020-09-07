import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int ans = 0,x,y;
		y = i;
		for (;i!=0;)
		{
			x = i%10;
			i = i/10;
			ans = ans*10+x;
		}
		if (ans == y)
		{
			System.out.println(y + " is Palindrome");
		}
		else System.out.println(y + " isn't Palindrome");
	}
}
