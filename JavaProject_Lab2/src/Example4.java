import java.text.*;
import javax.swing.*;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName = JOptionPane.showInputDialog("Input product name : ");
		/*String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		int productUnit = Integer.parseInt(strUnit);*/
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input product unit : "));
		/*String strPrice = JOptionPane.showInputDialog("Input price per unit : ");
		float productPerUnit = Float.parseFloat(strPrice);*/
		float productPerUnit = Float.parseFloat(JOptionPane.showInputDialog("Input price per unit : "));
		float totalPrice = productUnit*productPerUnit;
		float vat = totalPrice*107/100;
		JOptionPane.showMessageDialog(null,"Total Price is "+frm.format(totalPrice)+" baht."+"\nAdd Vat 7 % is "+frm.format(vat)+" baht.");

	}

}
