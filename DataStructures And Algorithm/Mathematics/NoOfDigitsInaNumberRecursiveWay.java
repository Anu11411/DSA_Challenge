package Mathematics;
import java.util.Scanner;
public class NoOfDigitsInaNumberRecursiveWay 
{
         
            public static int  findNumberOfDigits(int n)
            {
                      if(n == 0)
                         {
                            return 0;
                         }
                         return  1+findNumberOfDigits(n/10);
            }
    public static void main(String[] args)
     {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter the number :");
                int num = input.nextInt();
                int result = findNumberOfDigits(num);
                System.out.println("Number of Digits in a number is "+result);
    }
}
