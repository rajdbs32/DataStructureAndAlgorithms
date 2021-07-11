package scannerUserInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	      int x = sc.nextInt(); //took our input and assigned to sc.
		  double y =  sc.nextDouble();
		
		String hello = sc.nextLine(); //for sentence or words
		
		System.out.println(hello);
	}

}
