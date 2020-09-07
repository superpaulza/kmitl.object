import java.util.Scanner;
class CircleArea
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Radius of the Circle ==> ");
		double r = input.nextDouble();
		double a = 3.1416*r*r;
		System.out.printf("Area of This Circle = %.2f %n",a);
	}
}
