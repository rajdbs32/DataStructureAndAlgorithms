package normalCalculator;
import java.util.Scanner;
public class NormalCalculator {

	public static void main(String[] args) {
		// Proft loss calculattor 
		Scanner sc = new Scanner(System.in);
		int CostPrice = sc.nextInt();
		int SellingPrice = sc.nextInt();

		float  Gain = SellingPrice - CostPrice;
		float GainPercent = (((float)Gain/(float)CostPrice)*100);
		
		System.out.println("your gain is " + Gain);
		System.out.println("your gain percent is " + GainPercent);
		

		

	}

}
