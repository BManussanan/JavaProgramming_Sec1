import javax.swing.*;
import java.util.*;
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		int withdrawMoney = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+frm.format(balance)+"\nInput money to withdraw: "));
		if(withdrawMoney>=balance) {
			JOptionPane.showMessageDialog(null, "ERROR:Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}else if(withdrawMoney>20000) {
			JOptionPane.showMessageDialog(null, "ERROR:Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}else if(withdrawMoney%100!=0) {
			int mod = withdrawMoney%100;
			JOptionPane.showMessageDialog(null, "ERROR:Cannot withdraw "+mod+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}else {
			int thousand = withdrawMoney/1000;
			int five = (withdrawMoney-(thousand*1000))/500;
			int hundred = (withdrawMoney-(thousand*1000)-(five*500))/100;
			JOptionPane.showMessageDialog(null, "Your withdraw "+withdrawMoney+" baht."+
					"\n1,000 = "+thousand+"\n500 = "+five+"\n100 = "+hundred);
		}
	}

}
