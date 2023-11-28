import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab101 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Input Product Name : ");
		String productName = input.nextLine();
		System.out.print("Input Product Unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per unit : ");
		float productPerUnit = input.nextInt();
		System.out.println("---------------------------------------------");
		float totalPrice = productUnit*productPerUnit;
		System.out.println("Total Price is "+frm.format(totalPrice)+" baht.");
		System.out.println("---------------------------------------------");
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		System.out.println("---------------------------------------------");
		double totaldiscount = totalPrice*discount/100;
		double total = totalPrice-totaldiscount;
		System.out.println("Discount from 15%\t"+frm.format(totaldiscount)+" baht."+"\nAmount to be paid\t"+frm.format(total)+" baht");

	}

}
