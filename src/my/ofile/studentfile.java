package my.ofile;
import java.io.*;
import java.util.*;
public class studentfile {

	public static void main(String[] args) throws IOException {
		String path = "data/student.txt";
		Scanner fileln = new Scanner(new FileReader(path));
		String line;
		int count = 0;
		while(fileln.hasNext()) {
			//nextLine (Read one line) 
			//next (Read one word)
			line = fileln.nextLine();
			System.out.println(line);
			count++;
		}
		System.out.print("Number of Student: " + count);
	}

}
