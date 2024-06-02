package Loops;
import java.util.Scanner;
public class SumOfDigita
 {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
         int extractDigit = num ;
         int sum = 0;
         while(num != 0){
            extractDigit = num % 10 ;
            num= num /10;
            sum = sum + extractDigit ;
         }
         System.out.print("Sum of the digit is "+ sum);
    }
}
