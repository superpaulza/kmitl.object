import java.util.Scanner;
class  WeightControl
{
	public static void main(String[] args) 
	{
		double p = 10;
		Scanner input = new Scanner(System.in);
		double now,reduce,total = 0;
		System.out.print("Enter Your Weight : ");
		double weight = input.nextDouble();
		System.out.println("month\tweight\t%\treduce\tnow\ttotal_reduce");
		for (int month = 1; month <= 8;month++)
		{
			reduce = weight*(p/100);
		    now = weight - reduce;
			total = total + reduce;
			System.out.printf("%d\t%.1f\t%.0f\t%.3f\t%.3f\t%.3f\n",month,weight,p,reduce,now,total);
			weight = now;
			p--;
		}
	}
}
