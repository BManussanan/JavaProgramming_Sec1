import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("input a senntence,again: ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int spacebar = 0;
		
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spacebar++;
			}
		}
		System.out.println("This sentence has "+spacebar+" spacebar.");
		System.out.println("This sentence has "+(spacebar+1)+" word.");

	}

}
