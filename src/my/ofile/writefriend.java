package my.ofile;

import java.io.*;
import java.util.Scanner;

public class writefriend {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String path = "data/friend.dat";
		DataOutputStream fileOut = new DataOutputStream(new FileOutputStream(path));
		int zip;
		String name,address,tel;
		for (int i = 1;i <= 1;i++) {
			//Input Data Stored in HDD
			System.out.println("Enter friend no. "+ i);
			System.out.print("Name: "); name = sc.nextLine();
			System.out.print("Tel: "); tel = sc.nextLine();
			System.out.print("Address: "); address = sc.nextLine();
			System.out.print("Zip: "); zip = sc.nextInt();
			sc.nextLine();
			
			//Write Data from HDD to file.dat (Bytes)
			fileOut.writeUTF(name);
			fileOut.writeUTF(tel);
			fileOut.writeUTF(address);
			fileOut.writeInt(zip);
		}
		fileOut.close();
	}
}
