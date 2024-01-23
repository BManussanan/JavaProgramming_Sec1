import javax.swing.JOptionPane;

public class Shop100Baht {

	public static void main(String[] args) {
		Product sold= new Product();
		int bottonConfirm=JOptionPane.showConfirmDialog(null,"Is the program run on Pattanakrn Branch?");
		
		if(bottonConfirm==0) {
			sold = new PattanakarnBranch();
		}
		int numberofProduct = Integer.parseInt(JOptionPane.showInputDialog
				("Input the number of product"));
		sold.setUnit(numberofProduct);
		
		JOptionPane.showMessageDialog(null, sold.toString());
	

	}
}
