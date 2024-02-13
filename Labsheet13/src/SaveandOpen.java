import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee {
	private String name;
	private String dept;
	public void insert() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintStream writeFile = new PrintStream((new File("d://txtFile//empolyee.txt")));
		String answer;
		do {
			header();
			System.out.print("Enter name : ");
			name = input.next();
			System.out.print("Enter department : ");
			dept = input.next();
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again? : ");
			answer = input.next();
		}while(answer.equalsIgnoreCase("y"));
		writeFile.close();
	}
	public void read(){
		try {
			Scanner readFile = new Scanner((new File("d://txtFile//empolyee.txt")));
			boolean check = false;
			header();
			int i =0;
			int num =1;
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(num+") "+name);
					check=true;
					num++;
					i++;
				}
			}
			header();
			System.out.print("Employee in dept HR is "+i+" person.");
			if(check==false) {
				header();
				System.out.print("\nSorry,no department: "+super.getDept()+" in file.");
			}
		}catch(IOException e) {
			System.out.println("Sorry,file not found");
		}
	}
}
