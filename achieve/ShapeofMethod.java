import java.util.*;
class ShapeofMethod
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Shape of Method Program");
		System.out.println("Please make a choice");
		System.out.println("1: Find shade rectangle area that overlap the fit circle");
		System.out.println("2: Find n shade even circle area that overlap the circle");
		System.out.println();
		System.out.print("Enter Choice: ");
		int choice = input.nextInt();
		switch (choice)
		{
		case 1:
		System.out.print("Width = "); double w = input.nextDouble();
		System.out.print("Length = "); double l = input.nextDouble();
		if (w == l) System.out.println("Area = "+ (Arearectangle(w,l) - AreaCircle(w/2)));
		else System.out.println("Area = "+ (Arearectangle(w,l) - AreaEllipse(w,l)));
			break;
		case 2:
		System.out.print("Radius = "); double r = input.nextDouble();
		System.out.print("Amount of Circles = "); int n = input.nextInt();
		for (int i = 1; i < n; i++)
		{
			AreaCircle(r);

		}
			break;
		default:
			return;
		}
	}

	public static double Arearectangle(double w, double l)
	{
		return w*l;
	}
	public static double AreaCircle(double r)
	{
		return 3.1416*r*r;
	}
	public static double CurcumCircle(double r)
	{
		return 2*3.1416*r;
	}
	public static double AreaEllipse(double w, double l)
	{
		return (3.1416/4)*w*l;
	}
	public static double CurcumEllipse(double w, double l)
	{
		return (3.1416*w*l)/2;
	}
}
