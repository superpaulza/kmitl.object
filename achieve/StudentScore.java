import java.util.*;
class StudentScore
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Students = ");
		int n = input.nextInt();
		double []score = new double[n];
		GetData(score);
		System.out.println("Sum = " + sum(score));
		System.out.println("Xbar = " + xsum(score));
		System.out.println("S.D. = " + sd(score,xsum(score)));
		System.out.println("\n== Data in array ==\n");
		PrintData(score);



	}

	public static void GetData(double []score) {
		for (int i = 0; i<score.length; i++ )
		{
			System.out.print("Student " + "[" + (i+1) + "]" + " => ");
			score[i] = input.nextDouble();
		}
	}

	public static void PrintData(double []score) {
		for (int i = 0; i<score.length; i++ ) {
			System.out.println("Student " + "[" + (i+1) + "]" + " = " + score[i]);
		}
		System.out.println();
	}
	
	public static double xsum(double []score) {
		double sum = 0;
		for (int i = 0; i<score.length ; i++ ) {
			sum = sum + score[i];
		}
		return sum/score.length;
	}

	public static double sum(double []score) {
		double sum = 0;
		for (int i = 0; i<score.length ; i++ ) {
			sum = sum + score[i];
		}
		return sum;
	}

	public static double sd(double []score, double x) {
		double sum = 0;
		for (int i = 0; i < score.length ; i++)
		{
			sum = sum + Math.pow(score[i]-x,2);
		}
		double sd = Math.sqrt(sum/score.length);
		return sd;
	}
}