import java.util.*;
import java.io.*;
public class SentenceText {

	public static void main(String[] args) throws IOException{
		//create object to write data to file 
		//if input again will replace by new input
		PrintStream writeFile = new PrintStream((new File("d://txtFile//sentence.txt")));
		//create object for input data from keyboard
		Scanner input = new Scanner(System.in);
		int i =1;
		while(true) {
			System.out.print("Sentence: ");
			String word = input.next().toUpperCase(); //.next don't have black space
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			
			//save data to file( write file)
			writeFile.println(i+":"+word);
			i++;
			}
		System.out.println("File is save !!");
		writeFile.close();

	}

}
