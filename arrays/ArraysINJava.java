package arrays;

public class ArraysINJava {
    public static void main(String[] args){
        //arrays syntax and use.
        int [] marks = {1,2,3,5};
        marks [3]=34;   //updated the value aat 3rd position from 5 to 34.
        System.out.println(marks[0]);  //value at 0th position i.e. 1.
        System.out.println(marks[3]); //prints the value at 3rd position.

        //for loop in arrays.
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]); //prints all the values in the array marks
        }



    }
}
