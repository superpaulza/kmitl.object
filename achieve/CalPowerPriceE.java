import java.util.*;
class CalPowerPriceE 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter unit ==> ");
		double unit = input.nextDouble();
		double price = 0;
		if(unit<21) price = unit*2;
		else if(unit<101) price = 40+(unit-20)*3;
		else if(unit<501) price = 280+(unit-100)*3.50;
		else price = 1680+(unit-500)*4;
		price = price + 60 + (unit*0.47);
		System.out.println("Power cost is = " + price);
	}
}
