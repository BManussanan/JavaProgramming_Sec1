import java.text.*;
import javax.swing.*;
public class Lab101 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName = JOptionPane.showInputDialog("Input Product Name : ");
		int productUnit = Integer.parseInt(System.out.print("Input Product Unit : "));
		float productPerUnit = Float.parseFloat(System.out.print("Input Price per unit : "));
		System.out.println("---------------------------------------------");
		float totalPrice = productUnit*productPerUnit;
		System.out.println("Total Price is "+totalPrice+" baht.");
		System.out.println("---------------------------------------------");
		int vat = Integer.parseInt(System.out.print("How many discount (%) : "));
		System.out.println("---------------------------------------------");
		float discount = totalPrice*15/100;
		float total = totalPrice-discount;
		System.out.println("Discount from 15%\t"+discount+" baht."+"\nAmount to be paid\t"+total+"baht");

	}

}
