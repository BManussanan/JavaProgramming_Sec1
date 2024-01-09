import java.util.*;
public class TestPiggyBank {
	static PiggyBank pb = new PiggyBank();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		inputCoin();
		/*PiggyBank pb = new PiggyBank();
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);
		 }*/
}
	public static void inputCoin() {
		System.out.println("Money total : "+pb.getTotal());
		System.out.print("Please define size of PiggyBank : ");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Size of your PiggyBank : "+pb.getPiggyBank());
		MainMenu();
	}
	public static void MainMenu() {
		int total = 0;
		while(true) {
			System.out.println("============================");
			System.out.println("Menu of PiggyBank");
			System.out.println("============================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit");
			System.out.println("============================");
			System.out.print("Please Select Menu[1-5] : ");
			int select = scan.nextInt();
			if(select==5) {
				System.out.println("Bye Bye");
				break;
			}else if(select==1) {
				System.out.print("Insert 1 Baht Money : ");
				int insert = scan.nextInt();
				pb.addOne(insert);
				System.out.println("Monney Total : "+pb.getTotal());
			}else if(select==2){
				System.out.print("Insert 2 Baht Money : ");
				int insert = scan.nextInt();
				pb.addTwo(insert);
				System.out.println("Monney Total : "+pb.getTotal());
			}else if(select==3){
				System.out.print("Insert 5 Baht Money : ");
				int insert = scan.nextInt();
				pb.addFive(insert);
				System.out.println("Monney Total : "+pb.getTotal());
			}else if(select==4){
				System.out.print("Insert 10 Baht Money : ");
				int insert = scan.nextInt();
				pb.addTen(insert);
				System.out.println("Monney Total : "+pb.getTotal());
			}
			
		}
	}
}