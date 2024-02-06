import java.util.*;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args)throws IOException  {
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) {
			String fname = readFile.next();
			char surname = readFile.next().charAt(0);
			readFile.next();//read password
			String email = readFile.next().toUpperCase();
			System.out.println(surname+"."+fname +" "+"("+email+")");
		}
		readFile.close();

	}

}
