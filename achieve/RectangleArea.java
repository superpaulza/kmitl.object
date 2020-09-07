import java.util.Scanner;
class RectangleArea
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Width of the Rectangle ==> ");
		double w = input.nextDouble();
		System.out.print("Please Enter Length of the Rectangle ==> ");
		double l = input.nextDouble();
		double a = w*l;
		System.out.printf("Area of This Rectangle = %.3f %n",a);
	}
}
