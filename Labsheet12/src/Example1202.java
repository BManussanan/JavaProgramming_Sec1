import java.util.*;
import java.io.*;
public class Example1202 {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section : ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);
		

	}
	public static void showListStudent(int sectioninput)throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp = "";
		while((tmp=readFile.readLine())!=null) {
			String[]data=tmp.split("\t");
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			int section1 = Integer.parseInt(data[3]);
			if(section1==sectioninput)
			System.out.println(data[0]+"\t"+data[2]+"\t"+midtermScore+"\t"
			+finalScore+"\t"+findResult(midtermScore, finalScore));
		}
	}
	public static String findResult(double midtermscore ,double finalscore) {
		double totalScore = midtermscore+finalscore;
		if(totalScore<=40) {
			return "FAIL";
		}else {
			return "PASS";
		}
	}
	public static void Header(int sec) {
		System.out.println("***************************************************************");
		System.out.println("\t\tList of Data for Section "+sec);
		System.out.println("***************************************************************");
	}
	

}
