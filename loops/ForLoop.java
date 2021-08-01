package loops;

public class ForLoop {

    public static void main(String[] args){
            //to find the sum of all numbers from 1 to 100 or upto n number.
        int n = 100; //or n times
        int sum = 0;
        for (int i = 1; i <= n; i++ ) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}


