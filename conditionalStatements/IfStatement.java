package conditionalStatements;
import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();		
	 if (age >= 21) {
		 System.out.println("you can drink as much as you can");
	 }
	 else {
		 System.out.println("go drink milk");
	 }
		 
	}

}
