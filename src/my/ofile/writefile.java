package my.ofile;
import java.io.*;
import java.util.*;

public class writefile {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String path = "data/filewriter.pankrub";
		PrintWriter fileOut = new PrintWriter(new BufferedWriter (new FileWriter(path,true)));
		double mid,fin;
		String id,dept,name;
		for (int i = 1;i <= 3;i++) {
			System.out.println("Enter student no"+i);
			System.out.print("id : "); id = sc.nextLine();
			System.out.print("dept : "); dept = sc.nextLine();
			System.out.print("name : "); name = sc.nextLine();
			System.out.print("mid : "); mid = sc.nextDouble();
			System.out.print("final : "); fin = sc.nextDouble();
			sc.nextLine();
			fileOut.println(id + "\t" + dept + "\t" + formText(name,15)+"\t"+ mid +"\t" + fin);	
		}
		fileOut.close();
	}
	
	public static String formText (String x, int l) {
		int p = x.length();
		for (int i = p+1; i<=l;i++)
			x = x+" ";
		return (x);
	}

}
