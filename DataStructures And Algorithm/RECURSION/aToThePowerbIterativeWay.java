package RECURSION;
        //Iterative way to find the a to the power b
import java.util.Scanner;
        public class aToThePowerbIterativeWay 
        {
                public static void power(int a , int b)
                        {       
                            int product = 1;
                                for(int i =1 ; i <= b ;i++)
                                {
                                    product = a*product; 
                                }
                                System.out.println(product);
                        }
                public static void main(String[] args) 
                {
                        Scanner input = new Scanner(System.in);
                                System.out.print("Enter the value of a :");
                                int a = input.nextInt();

                                System.out.print("Enter the value of b :");
                                int b = input.nextInt();
                                power(a, b);
                }
        }
