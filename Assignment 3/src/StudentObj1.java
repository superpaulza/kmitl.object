import java.util.Scanner;

public class StudentObj1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number of student => "); int no = sc.nextInt();
		for (;no > 0; no--) {
			System.out.print("enter Id => "); int i = sc.nextInt();
			sc.nextLine();
			System.out.print("enter Name => "); String n = sc.nextLine();
			System.out.print("enter Gpa => "); double g = sc.nextDouble();
			System.out.print("enter OnetEnglish => "); double eng = sc.nextDouble();
			System.out.print("enter OnetMath => "); double math = sc.nextDouble();
			System.out.print("enter OnetScience => "); double sci = sc.nextDouble();
			Student std = new Student(i,n,g,eng,math,sci);
			//Output
			System.out.printf("Id   %d\tName   %s\nGpa   %.2f\tOnetEnglish   %.2f\nOnetMath   %.2f\tOnetScience   %.2f\nPoint = %.2f\n",std.getId(),std.getName(),std.getGpa(),std.getEng(),std.getMath(),std.getScience(),std.calPoint());
		}
	}
}
