package Loops;
import java.util.Scanner;
public class AtoThePowerB 
{
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
       
        // 2 to the power 4 --> 2*2*2*2
        System.out.print("Enter the  value of base :");
        int base = input.nextInt();
        System.out.print("Enter the value of power :");
        int power = input.nextInt();
        int result = 1;
        for(int i = 1 ; i <= power ; i++){
          result = result * base ;   
        }
        System.out.println(result);
        
    }
}
