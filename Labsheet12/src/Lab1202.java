import java.util.*;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input email: ");
		String emailinput = scan.next();
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) {
			readFile.next();
			readFile.next();
			String password = readFile.next();
			String email = readFile.next();
			if(emailinput.equals(email)) {
				System.out.println("Your password is "+password);
				break;
			}else {
				System.out.println("The data not found...");
				break;
			}
		}
		readFile.close();

	}

}
