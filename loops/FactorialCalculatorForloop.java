package loops;
import java.util.Scanner;

public class FactorialCalculatorForloop {

    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int i, fact=1;
        int x = sc.nextInt();// the number whose factorial is to be calculated.
        for (i=1; i<=x ; i++){
            fact = fact * i; //formula for factorial.
        }
        System.out.println("factorialOf " +x+ "is "+fact);
    }
}
