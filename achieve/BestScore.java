import java.util.Scanner;
class BestScore 
{
	public static void main(String[] args) 
	{
		int bt = 0;
		String gd;
		Scanner input = new Scanner(System.in);
		System.out.print("Student Name: ");
		String name = input.nextLine();
		System.out.print("Test Score 1 (50): ");
		int tsc1 = input.nextInt();
		System.out.print("Test Score 2 (50): ");
		int tsc2 = input.nextInt();
		System.out.print("Std Score (50): ");
		int stsc = input.nextInt();
		int sum = 0;
		if (tsc1 > tsc2) {sum = tsc1 + stsc;
							bt = tsc1;}
		else {sum = tsc2 + stsc;
				bt = tsc2;}
		if (sum >= 80) gd = "A";
		else if (sum >= 70) gd = "B";
		else if (sum >= 60) gd = "C";
		else if (sum >= 50) gd = "D";
		else gd = "F";
		System.out.println("== Result ==");
		System.out.println("[Name]: " + name + " " + "[Test Score]: " + bt + " " + "[Std Score]: " + stsc + " " + "[Total Score]: " + sum + " " + "[Grade]: " + gd);
		

	}
}
