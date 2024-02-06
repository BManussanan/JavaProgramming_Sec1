import java.util.*;
import java.io.*;
public class Lab1204 {

	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter rating of books : ");
		double rating = scan.nextDouble();
		int i =1;
		int total = 0;
		String tmp = "";
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//Bookdata.txt"));
		System.out.println("--------------------------------------------------------------");
		while((tmp=readFile.readLine())!=null) {
			String[]data=tmp.split("\t");
			double rate = Double.parseDouble(data[2]);
			total++;
		if(rating==rate) {
			System.out.println("Book "+i+":"+data[0]+"write by "+data[1]+" ("+data[4]+") "+"reviews");
			i++;
		}
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("There are "+(total-i)+" book get rating more than "+rating);
	}

}
