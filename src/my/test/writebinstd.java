package my.test;
import java.io.*;
import java.util.Scanner;

public class writebinstd {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String path = "data/student.dat";
		DataOutputStream fileOut = new DataOutputStream(new FileOutputStream(path));
		int mid,fin,no;
		String name,dept;
		for (int i = 1;i <= 3;i++) {
			//Input Data Stored in HDD
			System.out.println("Enter Student no. "+ i);
			System.out.print("No: "); no = sc.nextInt();
			System.out.print("Name: "); name = sc.nextLine();
			sc.nextLine();
			System.out.print("Dept: "); dept = sc.nextLine();
			System.out.print("Mid: "); mid = sc.nextInt();
			System.out.print("Fin: "); fin = sc.nextInt();
			
			//Write Data from HDD to file.dat (Bytes)
			fileOut.writeInt(no);
			fileOut.writeUTF(name);
			fileOut.writeUTF(dept);
			fileOut.writeInt(mid);
			fileOut.writeInt(fin);
		}
		fileOut.close();
	}
}