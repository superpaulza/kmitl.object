import java.util.*;
class CalCalendar 
{
	static Scanner input = new Scanner(System.in);
	static int [] nmonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	static String [] month = {" ","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	public static void main(String[] args) 
	{
		int dd1,dd2,mm1,mm2,yy1,yy2,ch,nod;
		System.out.println("Please Make a choice!");
		System.out.println("\t\"1\" to Calaculate Date Between Two Dates (Count Days: Duration)");
		System.out.println("\t\"2\" to Calaculate Date when given Number of days");
		System.out.println("\t\"-1\" to exit");
		System.out.print("Choice: "); ch = input.nextInt();
		switch (ch)
		{
		case 1:
			System.out.println("====== [ BEGIN ] ======");
			System.out.print("Day: "); dd1 = input.nextInt();
			System.out.print("Month: "); mm1 = input.nextInt();
			System.out.print("Year: "); yy1 = input.nextInt();
			System.out.println("======= [ END ] =======");
			System.out.print("Day: "); dd2 = input.nextInt();
			System.out.print("Month: "); mm2 = input.nextInt();
			System.out.print("Year: "); yy2 = input.nextInt();
			System.out.println("=======================");
			int sum = DayCount(dd1,mm1,yy1,dd2,mm2,yy2);
			System.out.println("From " + dd1 + " " + month[mm1] + " " + yy1 + " to " + dd2 + " " + month[mm2] + " " + yy2);
			if (sum < 2) System.out.println("Result: " + sum + " Day");
			else System.out.println("Result: " + sum + " Days");
			return;
		case 2:
			System.out.println("========================");
			System.out.print("Day: "); dd1 = input.nextInt();
			System.out.print("Month: "); mm1 = input.nextInt();
			System.out.print("Year: "); yy1 = input.nextInt();
			System.out.print("Number of days: "); nod = input.nextInt();
			System.out.println("========================");
			int []ans = DayForward(dd1,mm1,yy1,nod);
			if (nod < 2) System.out.println(nod + "Day" + " from " + dd1 + " " + month[mm1] + " " + yy1);
			else System.out.println(nod + " Days" + " from " + dd1 + " " + month[mm1] + " " + yy1);
			System.out.println("Result: " + ans[0] + " " + month[ans[1]] + " " + ans[2]);
			return;
		case 3:
			System.out.println("========================");
			System.out.print("Day: "); dd1 = input.nextInt();
			System.out.print("Month: "); mm1 = input.nextInt();
			System.out.print("Year: "); yy1 = input.nextInt();
			System.out.print("Number of days: "); nod = input.nextInt();
			System.out.println("========================");
			ans = DayBackward(dd1,mm1,yy1,nod);
			if (nod < 2) System.out.println(nod + "Day" + " from " + dd1 + " " + month[mm1] + " " + yy1);
			else System.out.println(nod + " Days" + " from " + dd1 + " " + month[mm1] + " " + yy1);
			System.out.println("Result: " + ans[0] + " " + month[ans[1]] + " " + ans[2]);
			return;
		case 4:
			System.out.println("====== [ BEGIN ] ======");
			System.out.print("Day: "); dd1 = input.nextInt();
			System.out.print("Month: "); mm1 = input.nextInt();
			System.out.print("Year: "); yy1 = input.nextInt();
			System.out.println("======= [ END ] =======");
			System.out.print("Day: "); dd2 = input.nextInt();
			System.out.print("Month: "); mm2 = input.nextInt();
			System.out.print("Year: "); yy2 = input.nextInt();
			System.out.println("=======================");
			sum = DayCountB(dd1,mm1,yy1,dd2,mm2,yy2);
			System.out.println("From " + dd1 + " " + month[mm1] + " " + yy1 + " to " + dd2 + " " + month[mm2] + " " + yy2);
			if (sum < 2) System.out.println("Result: " + sum + " Day");
			else System.out.println("Result: " + sum + " Days");
			return;
		case -1:
			return;
		}
	}

	public static int DayCount(int dd1,int mm1,int yy1,int dd2,int mm2, int yy2)
	{
		int sum = 0;
		yy1 -= 543;
		yy2 -= 543;
		if (IsLeap(yy1)) nmonth[2] = 29;
		while (dd1 != dd2 || mm1 != mm2 || yy1 != yy2)
		{
			sum++; dd1++;
			if (dd1 > nmonth[mm1])
			{
				dd1 = 1; mm1++;
				if (mm1 == 13)
				{
					mm1 = 1; yy1++;
					nmonth[2] = 28;
					if (IsLeap(yy1)) nmonth[2] = 29;
				}
			}
		}
		return sum;
	}

	public static boolean IsLeap(int yy)
	{
		if (yy%4 == 0 && (yy%100 != 0 || yy%400 == 0)) return true;
		else return false;
	}

	public static int[] DayForward(int dd1,int mm1,int yy1,int nod)
	{
		int [] ans = new int[4];
		int DayPassed = 0;
		yy1 -= 543;
		if (IsLeap(yy1)) nmonth[2] = 29;

		while (DayPassed < nod)
		{
			DayPassed++; dd1++;
			if (dd1 > nmonth[mm1])
			{
				dd1 = 1; mm1++;
				if (mm1 == 13)
				{
					mm1 = 1; yy1++;
					nmonth[2] = 28;
					if (IsLeap(yy1)) nmonth[2] = 29;
				}
			}
		}
		yy1+= 543;
		ans[0] = dd1; ans[1] = mm1; ans[2] = yy1;
		return ans; 
	}

	public static int[] DayBackward(int dd1,int mm1,int yy1,int nod)
	{
		int [] ans = new int[4];
		int DayPassed = 0;
		yy1 -= 543;
		if (IsLeap(yy1)) nmonth[2] = 29;

		while (DayPassed < nod)
		{
			DayPassed++; dd1--;
			if (dd1 > nmonth[mm1])
			{
				dd1 = 1; mm1--;
				if (mm1 == 13)
				{
					mm1 = 1; yy1--;
					nmonth[2] = 28;
					if (IsLeap(yy1)) nmonth[2] = 29;
				}
			}
		}
		yy1+= 543;
		ans[0] = dd1; ans[1] = mm1; ans[2] = yy1;
		return ans; 
	}

	public static int DayCountB(int dd1,int mm1,int yy1,int dd2,int mm2, int yy2)
	{
		int sum = 0;
		yy1 -= 543;
		yy2 -= 543;
		if (IsLeap(yy1)) nmonth[2] = 29;
		while (dd1 != dd2 || mm1 != mm2 || yy1 != yy2)
		{
			sum++; dd1--;
			if (dd1 ==0)
			{
				mm1--; dd1 = nmonth[mm1];
				if (mm1 == 0)
				{
					mm1 = 12; yy1--; dd1 = 31;
					nmonth[2] = 28;
					if (IsLeap(yy1)) nmonth[2] = 29;
				}
			}
		}
		return sum;
	}
}
