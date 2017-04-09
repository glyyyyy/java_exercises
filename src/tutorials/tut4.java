package tutorials;
import java.util.Scanner;

public class tut4 {
	public static void main (String args[]){
		Scanner bucky = new Scanner(System.in);
		double fnum,snum,anw;
		
		System.out.println("Enter first number: ");
		fnum = bucky.nextDouble();
		System.out.println("Enter second number: ");
		snum = bucky.nextDouble();
		anw = fnum + snum;
		System.out.println("Answer: " + anw);
		
	}
}
