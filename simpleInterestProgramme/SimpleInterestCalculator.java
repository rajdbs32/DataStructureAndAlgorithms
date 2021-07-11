package simpleInterestProgramme;
import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int PrincipalAmount = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		// formula for si = si*rste*time/100
		float simpleInterest = PrincipalAmount * rate * time / 100;
		
		System.out.println("the simple interest is " + simpleInterest);
		
	}

}
