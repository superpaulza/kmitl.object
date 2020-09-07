import java.util.Scanner;
class LCMnGCD 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please input number for find GCD and LCM ==> ");
		int a = input.nextInt();
		int b = input.nextInt();
		int i = a; int j = b; int k = 0;
		//find GCD
		for(;j!=0;) {
			k = j;
			j = i%j;
			i = k;
		}

		//find LCM
		int l = (a*b)/k;
		System.out.println("GCD of ("+a+","+b+")" + " is " + k +"\n"+ "LCM of ("+a+","+b+")" + " is " + l);
	}
}
