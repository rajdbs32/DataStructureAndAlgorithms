package patterns;
import java.util.Scanner;
public class patternMaking<row, space, j> {
    int  i, j, space;
    Scanner sc = new Scanner(System.in);
    int row;
    space = row - 1;
     for (j = 1; j<= row; j++)

    {
        row = sc.nextInt();
        space = 1;
        for (i = 1; i <= space; i++) {
            System.out.print(" ");
        }
        space--;
        for (i = 1; i <= 2 * j - 1; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    space = 1;
    for (j = 1; j<= row - 1; j++)
    {
        for (i = 1; i<= space; i++)
        {
            System.out.print(" ");
        }
        space++;
        for (i = 1; i<= 2 * (row - j) - 1; i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}


