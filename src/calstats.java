import java.util.Scanner;
import java.util.Arrays;
class  calstats
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println(" ===== Basic Statisic =====");
		System.out.print("Enter amount of Data = ");
		int n = input.nextInt();
		double []data = new double[n];
		GetData(data);
		System.out.println("Sum = " + sum(data));
		System.out.println("Xbar = " + xsum(data));
		System.out.println("S.D. = " + sd(data,xsum(data)));
		System.out.println("Min = " + min(data));
		System.out.println("Max = " + max(data));
		System.out.println("Mode = " + mode(data));
		System.out.println("Median = " + median(data));
		System.out.println("\n== Data in array ==\n");
		PrintData(data);
	}

	public static void GetData(double []data) {
		for (int i = 0; i<data.length; i++ )
		{
			System.out.print("Data " + "[" + (i+1) + "]" + " => ");
			data[i] = input.nextDouble();
		}
	}

	public static void PrintData(double []data) {
		for (int i = 0; i<data.length; i++ ) {
			System.out.println("Data " + "[" + (i+1) + "]" + " = " + data[i]);
		}
		System.out.println();
	}
	
	public static double xsum(double []data) {
		double sum = 0;
		for (int i = 0; i<data.length ; i++ ) {
			sum = sum + data[i];
		}
		return sum/data.length;
	}

	public static double sum(double []data) {
		double sum = 0;
		for (int i = 0; i<data.length ; i++ ) {
			sum = sum + data[i];
		}
		return sum;
	}

	public static double sd(double []data, double x) {
		double sum = 0;
		for (int i = 0; i < data.length ; i++)
		{
			sum = sum + Math.pow(data[i]-x,2);
		}
		double sd = Math.sqrt(sum/data.length);
		return sd;
	}

	public static double min(double []data) {
		double min = data[0];
		for (int i = 0; i < data.length ; i++)
		{
			double cur = data[i];
			if (min >= cur)	min = cur;
		}
		return min;
	}

	public static double max(double []data) {
		double max = data[0];
		for (int i = 0; i < data.length ; i++)
		{
			double cur = data[i];
			if (max <= cur) max = cur;
		}
		return max;
	}

	public static double mode(double []data) {
		int maxCount = 0;
		int count = 0;
		double mode = 0;
		for (int i = 0; i < data.length ; i++)
		{
			count = 0;
			for (int j = 0; j < data.length ; j++)
			{
				if (data[i] == data[j]) count++;
				else {
					if (count > maxCount)
					{
						mode = data[i];
						maxCount = count;
					}
				}
			}
		}
		if (maxCount == 1) return 0;
		return mode;
	}

	public static double median(double []data) {
		sort(data);
		double median = 0;
		int pos = (data.length+1)/2;
		if (data.length%2 == 0) median = ((data[pos]+data[pos-1])/2);
		else median = data[pos-1];
		return median;
	}

	public static void sort(double []data) {
		for (int i = 0; i < data.length-1 ; i++ )
		{
			int min = i;
			for (int j = i+1; j < data.length ; j++ )
				if (data[j] < data[min]) 
					min = j;
				double t = data[min];
				data[min] = data[i];
				data[i] = t;
		}
		System.out.println("sorted! data in array");
	}
}