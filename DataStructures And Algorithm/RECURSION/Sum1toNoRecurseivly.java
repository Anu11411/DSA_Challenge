package RECURSION;
import java.util.Scanner;
    public class Sum1toNoRecurseivly
    {
        public static int find(int n ,int sum)
            {  
                 if(n==1)
                 return 1;
                 return n+find(n-1,sum);

            }
      public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number upto which you have to find the sum:");
                 int num = input.nextInt();
                 int result =    find(num, 0);
                 System.out.println(result);     
        }
    }
