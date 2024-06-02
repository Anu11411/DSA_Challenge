package Loops;
import java.util.Scanner;
public class SumOfSeries 
{
    public static void main(String[] args)
     {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value of n ");
    int n = input.nextInt();
      int i = 1;
      int sumEven = 0;
      int sumOdd = 0;
      while( i <= n){
        if(i % 2 == 0 ){
        sumEven = sumEven + -i;
        }
       if( i % 2 != 0){
          sumOdd = sumOdd + i;
       }
       i++;

      }
      System.out.println("Sum of the given series is "+ (sumEven+sumOdd));    
    }
}
