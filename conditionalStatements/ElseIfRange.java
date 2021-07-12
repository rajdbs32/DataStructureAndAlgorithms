package conditionalStatements;
import java.util.Scanner;
//ElseIfRange Function
public class ElseIfRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
	 if (number <= 10 ) {
		 System.out.println("the number lies between 0 - 10");
	 }
	 else if (number <= 20 & number >=11) {
		 System.out.println("the number lies between 11 - 20");
	 }
	 else {
		 System.out.println("the number is greater than 20");
	 }
	}
	}
