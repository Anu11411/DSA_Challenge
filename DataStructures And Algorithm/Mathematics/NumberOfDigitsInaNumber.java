package Mathematics;
import java.util.Scanner;
public class NumberOfDigitsInaNumber {
    public static void main(String[] args)
     {
        /*
         * number of digits in a number --- eg-123,output--3
         * Iterative way to solve this problem
         */

         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number :");
         int n = input.nextInt();
          int extractdigit = n;
         int count = 0;
          while( n != 0)
          {
            extractdigit = n %10 ;
             n = n / 10;
             count = count +1;
          }
          System.out.println("Number of digits in a number  is "+ count);
    }
}
