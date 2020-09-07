import java.util.Scanner;
class CalCalendarJail
{
	static int [] nmonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int dd1,dd2,mm1,mm2,yy1,yy2,jd;
		System.out.print("Start Jail Date: "); dd1 = input.nextInt();
		System.out.print("Start Jail Month: "); mm1 = input.nextInt();
		System.out.print("Start Jail Year: "); yy1 = input.nextInt();
		System.out.print("Enter Jail Duration: "); jd = input.nextInt();
		System.out.print("Pardon Date: "); dd2 = input.nextInt();
		System.out.print("Pardon Month: "); mm2 = input.nextInt();
		System.out.print("Pardon Year: "); yy2 = input.nextInt();
		int []date = DayForward(dd1,mm1,yy1,jd);
		int count = DayCount(dd1,mm1,yy1,dd2,mm2,yy2);
		System.out.println("This prisoner will acquit in " + date[0] + " " + date[1] + " " + date [2]);
		System.out.println("% of pardon: "+ ((double) count/jd)*100 + "%");

	}

	public static boolean IsLeap(int yy)
	{
		if (yy%4 == 0 && (yy%100 != 0 || yy%400 == 0)) return true;
		else return false;
	}

	public static int[] DayForward(int dd1,int mm1,int yy1,int jd)
	{
		int [] ans = new int[4];
		int DayPassed = 0;
		if (IsLeap(yy1)) nmonth[2] = 29;

		while (DayPassed < jd)
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
		ans[0] = dd1; ans[1] = mm1; ans[2] = yy1;
		return ans; 
	}

	public static int DayCount(int dd1,int mm1,int yy1,int dd2,int mm2, int yy2)
	{
		int sum = 0;
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
}
