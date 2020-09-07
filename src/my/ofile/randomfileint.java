// int used 4 bytes
package my.ofile;
import java.io.*;

public class randomfileint {

	public static void main(String[] args) throws IOException {
		RandomAccessFile inOut = new RandomAccessFile("data/test.dat","rw");
		inOut.setLength(0);
		for(int i = 1; i <= 5; i++)
			inOut.writeInt(i);
		System.out.println("length = "+inOut.length());
		
		inOut.seek(0);
		System.out.println(inOut.readInt());
		inOut.seek(3*4);
		System.out.println(inOut.readInt());
		inOut.seek(2*4);
		System.out.println(inOut.readInt());
		System.out.println("----------------------");
		
		inOut.seek(0);
		for(int i = 1; i <= 5; i++) {
			int x = inOut.readInt();
			System.out.println(x);
		}
		inOut.close();
	}

}
