package loops;

public class NestedLoops {
    public static void main(String[] args){
        for(int j=1; j<=5; j++){ //this for will run the inner loop j times
            for(int i=1 ; i<=10; i++) {   //for loop to print numbers
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
