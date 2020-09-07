import java.util.*;
class ScoreLab
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter score Lab1 = ");
		int lab1 = input.nextInt();
		System.out.print("Enter score Lab2 = ");
		int lab2 = input.nextInt();
		System.out.print("Enter score Final = ");
		int fina = input.nextInt();
		int total = 0;
		if(lab1>lab2) total = lab1 + fina;
		else total = lab2 + fina;
		System.out.println("Your total score is " + total);
	}
}
