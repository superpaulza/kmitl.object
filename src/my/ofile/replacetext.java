package my.ofile;

import java.io.*;
import java.util.Scanner;

public class replacetext {

	public static void main(String[] args) throws IOException {
		String pathusr = "data/friend.txt";
		String path = "data/letter.txt";
		Scanner fileln = new Scanner(new FileReader(pathusr));
		String text,name,tel,address,zip;
		while(fileln.hasNext()) {
			name = fileln.next();
			tel = fileln.next();
			address = fileln.next()+" "+fileln.next()+" "+fileln.next();
			zip = fileln.next();
			Scanner fileN = new Scanner(new FileReader(path));
			while(fileN.hasNext()) {
				text = fileN.nextLine();
				String replace = text.replace("%%", name).replace("*", address).replace("#", tel).replace("%", zip);
				System.out.println(replace);
			}
			System.out.println("\n------------------------------------\n");
			fileN.close();
		}
	}
}
