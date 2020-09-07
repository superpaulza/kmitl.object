import java.util.Scanner;
class TriangleArea
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Base of the Triangle ==> ");
		double b = input.nextDouble();
		System.out.print("Please Enter Height of the Triangle ==> ");
		double h = input.nextDouble();
		double a = 0.5*b*h;
		System.out.printf("Area of This Triangle = %.3f %n",a);
	}
}
