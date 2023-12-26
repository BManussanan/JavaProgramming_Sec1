import javax.swing.*;
public class Lab705 {
	static String evennumber=" ",oddnumber=" ";

	public static void main(String[] args) {
		int[] number = new int[5];
		for(int i =0;i<number.length;i++) {
			number[i] =Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" :"));
		}
		showEven(number);
		showOdd(number);
	}
	public static void showEven(int[] number) {
		for(int _number:number){
			if(_number%2==0) {
				evennumber = evennumber + _number+" ";
			}
			
		}
		JOptionPane.showMessageDialog(null,"List of even number: \n"+evennumber);
		
	}
	public static void showOdd(int[] number) {
		for(int _number:number){
			if(_number%2!=0) {
				oddnumber = oddnumber + _number+" ";
			}
			
		}
		JOptionPane.showMessageDialog(null,"List of odd number: \n"+oddnumber);		
	}

}
