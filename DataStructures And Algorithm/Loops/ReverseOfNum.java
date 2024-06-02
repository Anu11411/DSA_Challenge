package Loops;
import java.util.Scanner;
public class ReverseOfNum 
{
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num =input.nextInt();
        int reverse = 0;
       // int extractDigit;
        while(num != 0)
        {
        //  extractDigit = num % 10;
          reverse = num % 10 + reverse * 10;
          num = num / 10;
        }
        System.out.println("Reverse of the given number is "+ reverse);
    }
}
