package nestedIfElse;
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		//finding he greater number 
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;
		if (a>b) {
			if (a>c) {
				result = a;
			}else {               //here it is checking if a is the biggest
				result =  c;
			}
		} else {
			if (b>c) {                      //here it is checking if b is the greater than c
				result = b;
			} else {                     //here it will check if c is greater than both of them
				result = c ;
			}


			}
		System.out.println("largest of the three numbers is " +result);
		}


	}
