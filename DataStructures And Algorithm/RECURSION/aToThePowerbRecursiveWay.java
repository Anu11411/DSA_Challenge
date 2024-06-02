package RECURSION;
import java.util.Scanner;
        public class aToThePowerbRecursiveWay 
        {
            public static int findPower(int a , int b)
                {
                    if(b == 0)
                    return 1;
                    return a*findPower(a, b-1);
                }
            public static void main(String[] args) 
                {
                   Scanner input = new Scanner(System.in);
                   System.out.print("Enter the value of a :");
                        int a = input.nextInt();
                   System.out.print("Enter the value of b :");
                        int b = input.nextInt();

                    int result = findPower(a, b);
                    System.out.println(result);
                }
        }
