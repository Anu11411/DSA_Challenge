package Patterns;
import java.util.Scanner;

public class ZeroAndOneTriangle
 {

    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = input.nextInt();
        int a ;
           
        for(int i = 1 ; i <= n ; i++)
        {        if(i % 2 !=0)
                   a=1;
                   else
                   a=0;
            for(int j = 1 ; j <=i ; j++)
            {       
                 System.out.print(a);
                 if(a == 0)
                 a=1;
                 else
                 a=0;
            }
            System.out.println();
        }
    }
}