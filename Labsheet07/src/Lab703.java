import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = {78,36,58,41,25,92,75};
		int currentindex=0,nextindex=0;
		System.out.print("Input index of array : ");
		int index = scan.nextInt();
		while(index<0||index>=number.length) {
			System.out.print("Input index of array, again : ");
			index = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is "+number[index]);
		if(index==(number.length-1)) {
			System.out.println("Sorry, "+(number.length-1)+" is the last index in array");
		}else {
			System.out.println("Value in next index is "+number[index+1]);
		}
		
	}

}
