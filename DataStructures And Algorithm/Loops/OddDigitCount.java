package Loops;
import java.util.Scanner;
public class OddDigitCount 
{
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number :");  
     int num = input.nextInt();
     int sum = 0;
     int extractDigit  ;
     while(num != 0)
     {
        extractDigit = num % 10 ;
        num = num/ 10;
        if(extractDigit % 2 != 0)
        {
            sum = sum + extractDigit ;
        
        }
        
     } 
     System.out.println("Sum of the odd digits in a given number is :"+ sum );
    }
}
