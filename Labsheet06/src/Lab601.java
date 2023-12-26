import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
	}
	public static void inputEmail(){
		String inputemail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
		while(inputemail.startsWith("@")||inputemail.startsWith(" ")) {
			 inputemail = JOptionPane.showInputDialog("Input your e-mail,again:").toLowerCase();
		}
		//bring input email to method checkEmail and return back
		boolean validateEmail = checkEmail(inputemail);
		if(validateEmail==true) {
			JOptionPane.showMessageDialog(null,"Your e-mail is "+inputemail);
		}else {
			JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail dot com"+inputemail);
		}
	}
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else return false;
		
	}
}
