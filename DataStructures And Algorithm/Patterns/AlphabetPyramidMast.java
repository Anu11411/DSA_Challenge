package Patterns;
import java.util.Scanner;
public class AlphabetPyramidMast {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int row = input.nextInt();
            int c = 65;
        for(int i = 1; i <= row ; i++)
        {// this loop will print  space
            int a = row - 1;
            for(int j = 1; j <= row - i ; j++){
                System.out.print(" ");
            }
            /*this loop will print
             
              A
             AB
            ABC
           ABCD
             */ 
            for(int k = 65 ; k <= c; k++)
            {
                System.out.print((char)k);
                 
            }
            // this loop will print rest of the part 
            for(int l = 1; l <= i-1; l++)
            {      
                System.out.print((char)(l+64));
                a--;
            }
            c++;
            System.out.println();
        }
    }
}
