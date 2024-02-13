import java.util.*;
import java.io.*;

public class ATMBanking {

	public static void main(String[] args) {
		String account, pass;
		int money;
		String a="-";
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account number : ");
		account=input.next();
		while(account.substring(0).length()!=1&&account.substring(a+1,5).length()!=3
				&&account.substring(a+5,9).length()!=3&&account.substring(a+9,12).length()!=2&&account.substring(a+11).length()!=1) {
			
		}
		System.out.print("Enter password : ");
		pass =input.next();
		while(pass.length()!=4) {
			System.out.print("Enter password : ");
			pass =input.next();
		}
		System.out.print("Enter money : ");
		money =Integer.inputIntnext();
		while(pass.length()!=4) {
			System.out.print("Enter password : ");
			pass =input.next();
		}

	}

}
