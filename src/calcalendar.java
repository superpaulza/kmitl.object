import my.*;
import java.util.*;

public class calcalendar {
	static Scanner input = new Scanner(System.in);
	static String [] month = {" ","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	static String [] day = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
 
	public static void main(String[] args) {
		System.out.println("Calender Calculator Program");
		mmenu();
	}
	public static void mmenu() {
		int ch;
		do {
			System.out.println("Please Make a choice!");
			System.out.println("\t\"1\" to Calaculate Date Between Two Dates (Count Days: Duration)");
			System.out.println("\t\"2\" to Calaculate Date when given Number of days");
			System.out.println("\t\"3\" to Print Calendar");
			System.out.println("\t\"4\" to Find day of a given date");
			System.out.println("\t\"0\" to Exit");
			System.out.print("Choice: "); ch = input.nextInt();
			switch (ch) {
			case 1:
				menu1();
				break;
			case 2:
				menu2();
				break;
			case 3:
				menu3();
				break;
			case 4:
				menu4();
				break;
			case 0:
				System.out.println("Thank you for using our program!, see you soon and Good bye~~");
				System.out.println("Program Terminated!");
				System.exit(0);                        
				break;
			}
		} while (ch != 0);
	}
	
	public static void menu1() {
		int ch;
		do {
			smenu1();
			System.out.print("Choice: "); ch = input.nextInt();
		switch (ch) {
		case 1:
			dayForward();
			break;
		case 2:
			dayBackward();
			break;
		case 99:
			mmenu();
			break;
			}
		} while (ch != 99);
	}
	public static void menu2() {
		int ch;
		do {
			smenu1();
			System.out.print("Choice: "); ch = input.nextInt();
		switch (ch) {
		case 1:
			CountForward();
			break;
		case 2:
			CountBackward();			
			break;
		case 99:
			mmenu();
			break;
			}
		} while (ch != 99);
	}
	public static void menu3() {
		int ch;
		do {
			System.out.println("Please select working mode");
			System.out.println("\t\"1\" 1-Month Calendar (Give 1st day of month)");
			System.out.println("\t\"2\" 1-Month Calendar (Give Date within month)");			
			System.out.println("\t\"3\" 1-Year Calendar (Give 1st day of year)");
			System.out.println("\t\"4\" 1-Year Calendar (Give Date within year)");
			System.out.println("\t\"99\" Back to Main Menu");
			System.out.print("Choice: "); ch = input.nextInt();
		switch (ch) {
		case 1:
			PrintCalendarFM();
			break;
		case 2:
			PrintCalendarWM();
			break;
		case 3:
			PrintCalendarFY();
			break;
		case 4:
			PrintCalendarWY();
			break;
		case 99:
			mmenu();
			break;
			}
		} while (ch != 99);
	}
	public static void menu4() {
		System.out.println("=======================");
		System.out.print("Day: "); int dd = input.nextInt();
		System.out.print("Month: "); int mm = input.nextInt();
		System.out.print("Year (B.E.): "); int yy = input.nextInt();
		System.out.println("====== [ Result ] ======");
		System.out.println(dd + " " + month[mm] + " " + yy + " is " + day[my.calendar.Findday(dd, mm, yy-543)]);
		System.out.println("=======================");
	}
	
	public static void smenu1() {
		System.out.println("Please select working mode");
		System.out.println("\t\"1\" Forward Day");
		System.out.println("\t\"2\" Backward Day");
		System.out.println("\t\"99\" Back to Main Menu");
	}

// Program's Method
	public static void dayForward() {
		int dd1,dd2,mm1,mm2,yy1,yy2;
		do {
		System.out.println("====== [ BEGIN ] ======");
		System.out.print("Day: "); dd1 = input.nextInt();
		System.out.print("Month: "); mm1 = input.nextInt();
		System.out.print("Year (B.E.): "); yy1 = input.nextInt();
		System.out.println("======= [ END ] =======");
		System.out.print("Day: "); dd2 = input.nextInt();
		System.out.print("Month: "); mm2 = input.nextInt();
		System.out.print("Year (B.E.): "); yy2 = input.nextInt();
		if ((dd2-dd1 < 0 || mm2-mm1 < 0) || yy2-yy1 < 0) System.out.println("Error! Please try again, Your input is going to backward.");
		} while ((dd2-dd1 < 0 || mm2-mm1 < 0) || yy2-yy1 < 0);
		System.out.println("====== [ Result ] ======");
		int sum = my.calendar.DayCount(dd1,mm1,yy1,dd2,mm2,yy2);
		System.out.println("From " + dd1 + " " + month[mm1] + " " + yy1 + " to " + dd2 + " " + month[mm2] + " " + yy2);
		if (sum < 2) System.out.println("Result: " + sum + " Day");
		else System.out.println("Result: " + sum + " Days");
		System.out.println("=======================");
	}
	
	public static void dayBackward() {
		int dd1,dd2,mm1,mm2,yy1,yy2;
		do {
		System.out.println("====== [ BEGIN ] ======");
		System.out.print("Day: "); dd1 = input.nextInt();
		System.out.print("Month: "); mm1 = input.nextInt();
		System.out.print("Year (B.E.): "); yy1 = input.nextInt();
		System.out.println("======= [ END ] =======");
		System.out.print("Day: "); dd2 = input.nextInt();
		System.out.print("Month: "); mm2 = input.nextInt();
		System.out.print("Year (B.E.): "); yy2 = input.nextInt();
		if ((dd1-dd2 < 0 || mm1-mm2 < 0) || yy1-yy2 < 0) System.out.println("Error! Please try again, Your input is going to forward.");
		} while ((dd1-dd2 < 0 || mm1-mm2 < 0) || yy1-yy2 < 0);
		System.out.println("====== [ Result ] ======");
		int sum = my.calendar.DayCountB(dd1,mm1,yy1,dd2,mm2,yy2);
		System.out.println("From " + dd1 + " " + month[mm1] + " " + yy1 + " to " + dd2 + " " + month[mm2] + " " + yy2);
		if (sum < 2) System.out.println("Result: " + sum + " Day");
		else System.out.println("Result: " + sum + " Days");
		System.out.println("=======================");
	}
	
	public static void CountForward() {
		int dd1,mm1,yy1,nod;
		System.out.println("========================");
		System.out.print("Day: "); dd1 = input.nextInt();
		System.out.print("Month: "); mm1 = input.nextInt();
		System.out.print("Year (B.E.): "); yy1 = input.nextInt();
		System.out.print("Number of days: "); nod = input.nextInt();
		System.out.println("====== [ Result ] ======");
		int []ans = my.calendar.DayForward(dd1,mm1,yy1,nod);
		if (nod < 2) System.out.println(nod + "Day" + " from " + dd1 + " " + month[mm1] + " " + yy1);
		else System.out.println(nod + " Days" + " from " + dd1 + " " + month[mm1] + " " + yy1);
		System.out.println("Result: " + ans[0] + " " + month[ans[1]] + " " + ans[2]);
		System.out.println("========================");
	}
	
	public static void CountBackward() {
		int dd1,mm1,yy1,nod;
		System.out.println("========================");
		System.out.print("Day: "); dd1 = input.nextInt();
		System.out.print("Month: "); mm1 = input.nextInt();
		System.out.print("Year (B.E.): "); yy1 = input.nextInt();
		System.out.print("Number of days: "); nod = input.nextInt();
		System.out.println("====== [ Result ] ======");
		int []ans = my.calendar.DayBackward(dd1,mm1,yy1,nod);
		if (nod < 2) System.out.println(nod + "Day" + " from " + dd1 + " " + month[mm1] + " " + yy1);
		else System.out.println(nod + " Days" + " from " + dd1 + " " + month[mm1] + " " + yy1);
		System.out.println("Result: " + ans[0] + " " + month[ans[1]] + " " + ans[2]);
		System.out.println("========================");
	}

	public static void PrintCalendarFM() {
		System.out.println("=======================");
		System.out.println("Please Enter abbreviation of day (Ex. Sun = Sunday)");
		System.out.print("first day of month: "); String fd = input.next();
		int dd = my.array.findIndexEIC(day, fd);
		System.out.println("Please Enter abbreviation of month (Ex. Jan = January)");
		System.out.print("Month: "); String fm = input.next();
		int mm = my.array.findIndexEIC(month, fm);
		System.out.print("calendar's year (B.E.): "); int yy = input.nextInt();
		System.out.println("=======================\n"); 
			my.calendar.PrintMonthHeader(mm,yy);
			my.calendar.PrintMonthBody(dd,mm,yy);
	}

	public static void PrintCalendarWM() {
		System.out.println("=======================");
		System.out.print("Day: "); int dd = input.nextInt();
		System.out.print("Month: "); int mm = input.nextInt();
		System.out.print("calendar's year (B.E.): "); int yy = input.nextInt();
		System.out.println("=======================\n");
			dd = my.calendar.Findday(1, mm, yy-543);
			my.calendar.PrintMonthHeader(mm,yy);
			my.calendar.PrintMonthBody(dd,mm,yy);
	}

	public static void PrintCalendarFY() {
		System.out.println("=======================");
		System.out.println("Please Enter abbreviation of days (Ex. Sun = Sunday)");
		System.out.print("first day of the year: "); String fd = input.next();
		int dd = my.array.findIndexEIC(day, fd);
		System.out.print("calendar's year (B.E.): "); int yy = input.nextInt();
		System.out.println("=======================\n");
		for (int i = 0; i < 12;i++) {
			my.calendar.PrintMonthHeader(i+1,yy);
			my.calendar.PrintMonthBody(dd,i+1,yy);
			dd = my.calendar.CheckNextFD(dd,i+1,yy-543);
		}
	}

	public static void PrintCalendarWY() {
		System.out.println("=======================");
		System.out.print("Day: "); int dd = input.nextInt();
		System.out.print("Month: "); int mm = input.nextInt();
		System.out.print("calendar's year (B.E.): "); int yy = input.nextInt();
		System.out.println("=======================");
			dd = my.calendar.Findday(1, 1, yy-543);
		for (int i = 0; i < 12;i++) {
			my.calendar.PrintMonthHeader(i+1,yy);
			my.calendar.PrintMonthBody(dd,i+1,yy-543);
			dd = my.calendar.CheckNextFD(dd,i+1,yy-543);
		}
	}
}
