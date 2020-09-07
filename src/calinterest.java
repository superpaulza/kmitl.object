import java.util.*;
class  calinterest
{
	public static void main(String[] args) 
	{
		double rate; int month=1; int drate=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Principal: ");
		double pp = input.nextDouble();
		System.out.print("Enter Payment per month: ");
		double ppm = input.nextDouble();
		System.out.print("Month" + "\t" + "Rate/Year" + "\t" + "Principal" + "\t" + "Interest" + "\t" + "Pay for Principal" + "\t" + "Net" + "\n");
		for (;;month++ )
		{
			if (month <= 12) {rate = 0.04/12.00; 
								drate = 4;}
			else if (month <= 24 && month > 12) {rate = 0.05/12.00; 
													drate = 5;}
			else if (month <= 36 && month > 24) {rate = 0.06/12.00; 
													drate = 6;}
			else {rate = 0.07/12.00; 
					drate = 7;}
			//interest
			double in = pp * rate;
			double pfp = ppm - in;
			double net = pp - pfp;
			System.out.printf("%d\t%d\t%.2f\t%.2f\t%.2f\t%.2f\n",month,drate,pp,in,pfp,net);
			if (net <= 0) {pp = pp+in;
							break;}
			else pp = net;
		}
		System.out.println("You must pay " + month + " terms.");
		System.out.printf("Last Term = %.2f\n",pp);
	}
}
