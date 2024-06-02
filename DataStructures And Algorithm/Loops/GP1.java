package Loops;
import java.util.Scanner;
public class GP1
 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = input.nextInt();
       
        for(int i = 1 ; i <= Math.pow(2,n-1) ; i=i*2)
        {
            System.out.println(i );

        }

    }
}
