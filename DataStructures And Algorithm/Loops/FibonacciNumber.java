package Loops;
import java.util.Scanner;
public class FibonacciNumber
 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
        int a = 1;
        int b= 1;
        int sum = 1;
        for(int i = 1 ; i<= num - 2 ; i++)
        { sum = a+b;
            a = b;
            b= sum;


        }
        System.out.println( sum);
    }
}
