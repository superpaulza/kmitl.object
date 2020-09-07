
import java.util.Scanner;

public class StudentObj2 {

	public static void main(String[] args) {
		int i = 500, loc = 0;
		String n;
		double g,eng,math,sci,pt;
		Scanner sc = new Scanner(System.in);
		Student std[] = new Student[i];
		for (; i!=-1;) {
			System.out.print("enter Id(-1 for Exit) => "); i = sc.nextInt();
			sc.nextLine();
			if (i == -1) break;
			System.out.print("enter Name => "); n = sc.nextLine();
			System.out.print("enter Gpa => "); g = sc.nextDouble();
			System.out.print("enter OnetEnglish => "); eng = sc.nextDouble();
			System.out.print("enter OnetMath => "); math = sc.nextDouble();
			System.out.print("enter OnetScience => "); sci = sc.nextDouble();
				std[loc++] = new Student(i,n,g,eng,math,sci);
		}
		//Output
		for(i = 0; i < loc; i++) {
			System.out.printf("Id  %d\tName  %s\nGpa  %.2f\tOnetEnglish  %.2f\nOnetMath  %.2f\tOnetScience  %.2f\nPoint = %.2f\n",std[i].getId(),std[i].getName(),std[i].getGpa(),std[i].getEng(),std[i].getMath(),std[i].getScience(),std[i].calPoint());
			System.out.println("----------------------------");
		}
		System.out.println("--- end ---");
	}
}
