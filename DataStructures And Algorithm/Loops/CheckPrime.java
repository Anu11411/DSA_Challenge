package Loops;
import java.util.Scanner;
public class CheckPrime 
{
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
        int count = 0;
        for(int i = 1
        ; i <= num ; i++)
        {
            if(num % i == 0)
            {
                count = count + 1;
            }
        }
        if(count <= 2){
            System.out.println("Number is Prime. ");
        }
        else{
            System.out.println("Number is composite.");
        }
    }
}
