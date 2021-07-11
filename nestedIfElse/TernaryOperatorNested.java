package nestedIfElse;
import java.util.Scanner;
public class TernaryOperatorNested {

	public static void main(String[] args) {
		//Ternary operators usage 
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;

		result = a>b ? a>c ? a : c : b>c ? b : c;
		System.out.println("the greatest number is " +result);
	}

}
