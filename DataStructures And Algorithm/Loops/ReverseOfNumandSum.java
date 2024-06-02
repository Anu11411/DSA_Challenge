package Loops;
import java.util.Scanner;
public class ReverseOfNumandSum
 {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
         int sum = 0 ;
         int extractDigit ;
         int reverse = 0;
         while(num != 0)
         {
            extractDigit = num % 10;
            sum = sum+ extractDigit ;
            reverse = extractDigit + reverse * 10;
            num = num / 10;
         }
         System.out.println("Reverse of the number is "+reverse);
         System.out.println("Sum of the number is "+ sum);
    }
}
