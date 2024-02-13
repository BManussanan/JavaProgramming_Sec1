import java.io.*;
import java.util.Scanner;

public class ATMChecking extends ATMData {
		private int money;
		public ATMChecking(String accountNumber,String password,int money) {
			super(accountNumber,password);
			this.money=money;

		}
		public boolean checkBookBank() throws IOException {
			Scanner readFile = new Scanner((new File("d://txtFile//ATMBookBank.txt")));
			while(readFile.hasNext()) {
				String id = readFile.next();
				String pass = readFile.next();
				if()
			}
		}
		public void show() {
			
		}
}
