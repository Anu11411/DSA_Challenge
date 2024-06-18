package Patterns;
import java.util.Scanner;

  public class StarPlus 
  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of line :");
           int n = input.nextInt();

           for(int i = 1;i<=n;i++)
           {
            for(int j = 1; j<=n ;j++)
            {
                if(n/2+1 == i)
                {
                    System.out.print("*");
                }
                else{
                    if(n/2+1   == j){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
           }
                
            
    }
}