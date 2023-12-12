import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input fullname : ");
		String fullName = scan.nextLine();
		int space = fullName.trim().indexOf(" ");
		char firstName = fullName.charAt(0);
		String midname = fullName.substring(space,space);
		System.out.print(firstName+"."+midname.charAt(0)+"."+fullName.substring(space));
		
	}

}
