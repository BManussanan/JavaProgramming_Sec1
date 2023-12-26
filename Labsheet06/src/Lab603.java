import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullname = scan.next();
		System.out.print(abbreviatName(fullname));
	}
	public static String abbreviatName(String name) {
		String firstname = name.substring(0,name.indexOf(' '));
		String midname = name.substring(name.indexOf(' ')+1,name.indexOf(' ')+2);
		String lastname = name.substring(name.indexOf(' ')+2,name.indexOf(' ')+2);
		return mid
	}

}
