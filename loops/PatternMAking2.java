package loops;

import java.util.Scanner;

public class PatternMAking2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        for(int i= 1; i<=n; i++){  //outer loop for the rows
            for(int j = 1; j<=n; j++) {       //inner loop for the pattern.
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); //to print out he spaces

                }
            }
        }System.out.println();
    }
}










