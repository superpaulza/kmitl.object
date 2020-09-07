package my.ofile;
import java.io.*;
import javax.swing.*;
import java.util.*;

public class filebinsearch {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String id,dept,name; double mid,fin; boolean notFound = true;
		String sname = "";
		String filename = JOptionPane.showInputDialog("Enter Input Filename without extension");
	try {
		DataInputStream fileln = new DataInputStream(new FileInputStream("data/"+filename+".txt"));
		sname = JOptionPane.showInputDialog("Enter Search Name");
		while(true) { 
		id = fileln.readUTF();
		dept = fileln.readUTF();
		name = fileln.readUTF();
		mid = fileln.readDouble();
		fin = fileln.readDouble();
		if (name.equals(sname)) {
			System.out.println(name+"\t"+mid+"\t"+fin);
			notFound = false;}
		} }
	//End Of File = EOF
	catch (EOFException e)
		{ if (notFound)
			{System.out.println("File Not Found! "+ sname);}
		}
	}
}
	
