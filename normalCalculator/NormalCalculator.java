package normalCalculator;
import java.util.Scanner;
public class NormalCalculator {

	public static void main(String[] args) {
		// Normal Calculator
		Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		//int Sum = a + b ;
		//System.out.println("the sum is " + Sum);
		
		//Profit calculator
		
		int CostPrice = sc.nextInt();
		int SellingPrice = sc.nextInt();
		
		float  Profit = SellingPrice - CostPrice;
		float ProfitPercent = (((float)Profit/(float)CostPrice)*100);
		
		System.out.println("your profit is " + Profit);
		System.out.println("your profitPercent is " + ProfitPercent);
		
	}

}
