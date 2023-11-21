import javax.swing.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		//DecimalFormat frm = new DecimalFormat("##.0");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight: "));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height: "));
		height = height/100;
		double bmi = weight/(height*height);
		String bmiCatergory;
		
		if(bmi<18.5)bmiCatergory = "Underweight";
		else if(bmi<25)bmiCatergory = "Normal-weight";
		else if(bmi<30)bmiCatergory = "Overweight";
		else bmiCatergory = "Obesity";
		JOptionPane.showMessageDialog(null, "BMI = "+String.format("%.1f",bmi)+"\nYou're "+bmiCatergory,"BMI",
										JOptionPane.WARNING_MESSAGE);
	}

}
