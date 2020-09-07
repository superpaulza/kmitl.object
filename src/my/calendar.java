package my;
import java.util.*;
public class calendar 
{
	static int [] nmonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	static String [] month = {" ","January","Febuary","March","April","May","June","July","August","September","October","November","December"};
	
	public static void main(String[] args) {}

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

	public static int CheckNextFD(int fd,int mm,int yy) {
		int nfd = 28;
		//Check Feb
		if (IsLeap(yy)) nmonth[2] = 29;
		//Next Month First Day
		while (nfd < nmonth[mm]) {
			if (fd == 6) fd = -1;
			nfd++; fd++;
		}
		nmonth[2] = 28;
		return fd;
	}
	
    public static int Findday(int day, int month, int year) {
    //Source: https://introcs.cs.princeton.edu/java/21function/Calendar.java.html
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d;
    }
	
	public static void PrintMonthHeader(int mm,int yy) {
		System.out.println("\t\t\t   "+month[mm] + " " + yy+"\t\n\t\t\t=.=.=.=.=.=.=.=.=.=");
		System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
	}
	
	public static void PrintMonthBody(int fd,int mm,int yy) {
		if (IsLeap(yy)) nmonth[2] = 29;
        for (int i = 0; i < fd; i++)
            System.out.print("\t");
        for (int i = 1; i <= nmonth[mm]; i++) {
            System.out.printf("\t%2d", i);
            if (((i + fd) % 7 == 0) || (i == nmonth[mm])) System.out.println();
        }
        System.out.println();
        System.out.println("\t=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\t");
        nmonth[2] = 28;
	}
}
