import java.util.Scanner; 
import java.io.*;
public class Example1201 {
	public static void main(String[] args)throws IOException {
		//read data from file using scanner class
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		//hasnext use to read file first sentence to end
		while(readFile.hasNext()) {
			//read name from file
			String fname = readFile.next();
			//String lname = readFile.next();
			readFile.next();//read surname
			readFile.next();//read password
			String email = readFile.next().toUpperCase();
			System.out.println(fname +" "+"("+email+")");
		}
		readFile.close();
	}

}
