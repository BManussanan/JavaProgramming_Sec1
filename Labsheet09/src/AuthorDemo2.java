import java.util.*;
public class AuthorDemo2 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			System.out.println("Information Author "+i);
			System.out.println("----------------------------------");
			Scanner scan = new Scanner(System.in);
			System.out.print("Input author name : ");
			String name = scan.nextLine();
			System.out.print("Input author e=mail : ");
			String email = scan.nextLine();
			System.out.println("----------------------------------");
			Author a1 = new Author(name,email);
			
		}
		System.out.println();
		System.out.println("1. "+a1.getName());
	

}
}
