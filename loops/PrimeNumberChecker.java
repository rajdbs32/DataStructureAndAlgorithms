package loops;

import java.util.Scanner; //needs to be imported manually to use the Scanner function.

public class PrimeNumberChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //takes input from the user.
        int n = sc.nextInt();
        boolean isPrime = true;
        for( int i = 2 ; i<n ; i++){     //(init:condition:iteration)      
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        if (n < 2) isPrime = false;
    System.out.println ("isprime " + isPrime);
  }
}
