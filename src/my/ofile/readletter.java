package my.ofile;
import java.io.*;
import java.util.*;

public class readletter {

	public static void main(String[] args) throws IOException {
		String path = "data/letter.txt";
		Scanner fileln = new Scanner(new FileReader(path));
		String line;
		int count = 0;
		while(fileln.hasNext()) {
			//nextLine (Read one line) 
			//next (Read one word)
			line = fileln.next();
			System.out.println(line);
			count++;
		}
		System.out.print("Number of Words: " + count);
	}

}
