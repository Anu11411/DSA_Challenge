package RECURSION;
import java.util.Scanner;
    public class Sum1toN 
    {       public static  void find(int n )
                {
                        int sum =0;
                        for(int i = 1; i <= n ; i++)
                            {
                                sum = sum+i;
                            }
                            System.out.println(sum);
                }
            public static void main(String[] args) 
        {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the number :");
                        int num = input.nextInt();
                        find(num);
        }    
    }
