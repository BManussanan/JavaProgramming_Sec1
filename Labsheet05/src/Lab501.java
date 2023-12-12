import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		int space = fullName.trim().indexOf(" ");
		if(space==-1) {
			System.out.print("Incorrect Name");
		}else {
			String firstName = (fullName.substring(0,space));
			String lastName = (fullName.substring(space+1));
			System.out.print("First Name: "+firstName.toUpperCase()+"\nLast Name: "+lastName.toLowerCase());
		}
	
	}

}
