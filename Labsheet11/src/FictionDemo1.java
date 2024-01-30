import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input title : ");
		String title = scan.nextLine();
		System.out.print("Input public year : ");
		int year = scan.nextInt();
		FictionBook f1 = new FictionBook(title,year);
		//System.out.println(f1);
		scan.nextLine();
		System.out.print("Input author name : ");
		String name = scan.nextLine();
		System.out.print("Input email : ");
		String email = scan.nextLine();
		f1.setAuthorName(name);
		f1.setEmail(email);
		while(!f1.checkFormatName()) {
			System.out.print("Input author name : ");
			name = scan.nextLine();
			f1.setAuthorName(name);
		}
		while(!f1.checkEmail()) {
			System.out.print("Input email : ");
			email = scan.nextLine();
			f1.setEmail(email);
		}
		System.out.println(f1);

	}

}
