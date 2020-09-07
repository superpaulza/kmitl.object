import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class StudentObj3 {

	public static void main(String[] args) throws IOException {
		int i = 0;
		String n;
		double g,eng,math,sci,pt;
		DataOutputStream fileOut = new DataOutputStream(new FileOutputStream("data/std.dat"));
		DataInputStream fileln = new DataInputStream(new FileInputStream("data/std.dat"));
		Scanner sc = new Scanner(System.in);
		for (; i!=-1;) {
			System.out.print("enter Id(-1 for Exit) => "); i = sc.nextInt();
			sc.nextLine();
			if (i == -1) break;
			System.out.print("enter Name => "); n = sc.nextLine();
			System.out.print("enter Gpa => "); g = sc.nextDouble();
			System.out.print("enter OnetEnglish => "); eng = sc.nextDouble();
			System.out.print("enter OnetMath => "); math = sc.nextDouble();
			System.out.print("enter OnetScience => "); sci = sc.nextDouble();
			Student std = new Student(i,n,g,eng,math,sci);
			//Write data to file
			fileOut.writeInt(std.getId());
			fileOut.writeUTF(std.getName());
			fileOut.writeDouble(std.getGpa());
			fileOut.writeDouble(std.getEng());
			fileOut.writeDouble(std.getMath());
			fileOut.writeDouble(std.getScience());
			fileOut.writeDouble(std.calPoint());
		}
		fileOut.close();
		//Read data from file
		try {
			while (true) {
				i = fileln.readInt();
				n = fileln.readUTF();
				g = fileln.readDouble();
				eng =fileln.readDouble();
				math = fileln.readDouble();
				sci = fileln.readDouble();
				pt = fileln.readDouble();
				System.out.printf("Id  %d\tName  %s\nGpa  %.2f\tOnetEnglish  %.2f\nOnetMath  %.2f\tOnetScience  %.2f\nPoint = %.2f\n",i,n,g,eng,math,sci,pt);
				System.out.println("----------------------------");
			}
		}
		//End of file exception
		catch (EOFException e) {
			System.out.println("--- end ---");
		}
	}
}
