
import java.util.Scanner;

public class StudentObjAB {

	public static void main(String[] args) {
		//i refer to number of student and id
		int i = 500, loc = 0;
		String n,gr;
		double g,eng,math,sci,pt,gat,pat1,pat2,s19,s29,s39,s49;
		Scanner sc = new Scanner(System.in);
		StudentAB std[] = new StudentAB[i];
		for (; i!=-1;) {
			System.out.print("enter Id(-1 for Exit) => "); i = sc.nextInt();
			sc.nextLine();
			if (i == -1) break;
			System.out.print("enter group => "); gr = sc.nextLine();
			System.out.print("enter Name => "); n = sc.nextLine();
			System.out.print("enter Gpa => "); g = sc.nextDouble();
			System.out.print("enter OnetEnglish => "); eng = sc.nextDouble();
			System.out.print("enter OnetMath => "); math = sc.nextDouble();
			System.out.print("enter OnetScience => "); sci = sc.nextDouble();
			if (gr.equals("a")) {
				System.out.print("enter gat => "); gat = sc.nextDouble();
				System.out.print("enter pat1 => "); pat1 = sc.nextDouble();
				System.out.print("enter pat2 => "); pat2 = sc.nextDouble();
				std[loc++] = new StudentA(i,n,g,eng,math,sci,gat,pat1,pat2);
			}
			if (gr.equals("b")) {
				System.out.print("enter s19 => "); s19 = sc.nextDouble();
				System.out.print("enter s29 => "); s29 = sc.nextDouble();
				System.out.print("enter s39 => "); s39 = sc.nextDouble();
				System.out.print("enter s49 => "); s49 = sc.nextDouble();
				std[loc++] = new StudentB(i,n,g,eng,math,sci,s19,s29,s39,s49);
			}
		}
		//Output
		for(i = 0; i < loc; i++) {
			System.out.printf("Id  %d\tName  %s\nGpa  %.2f\tOnetEnglish  %.2f\nOnetMath  %.2f\tOnetScience  %.2f\n%sPoint = %.2f\n",std[i].getId(),std[i].getName(),std[i].getGpa(),std[i].getEng(),std[i].getMath(),std[i].getScience(),std[i].printAB(),std[i].calPointAB());
			System.out.println("----------------------------");
		}
		System.out.println("--- end ---");
	}
}
