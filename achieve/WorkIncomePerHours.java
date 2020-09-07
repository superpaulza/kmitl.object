import java.util.*;
class WorkIncomePerHours 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ID = ");
		int id = input.nextInt();
		System.out.print("Enter Work hours = ");
		int hr = input.nextInt();
		System.out.print("Enter Income/hours = ");
		int w = input.nextInt();
		double total;
		if(hr<=40) total = w*hr;
		else total = 40*w + (hr-40)*1.5*w;
		System.out.println("Employee ID " + id + " have income " + total);
	}
}
