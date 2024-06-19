import java.util.Scanner;
/*
 * 
 * print the pattern Starcross
 */
public class StarCross {
 public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the  value of n :");
    int n = input.nextInt();
     for(int i = 1 ; i<= n ; i++)
     {
        for(int j=1 ; j<= n ; j++)
        {
          if(i == (n/2+1))
          {
            if(j == (n/2+1)){
              System.out.print("*");
            }
            else{
              System.out.print(" ");
            }
          }
          if((i==1) || (i==n)){
            if((j==1) || (j==n))
            {
              System.out.print("*");
            }
            else{
              System.out.print(" ");
            }

          }
         if((i>1 && i< n) && (i != (n/2+1)))
         {
           if((j >1 && j<n) &&(j !=(n/2+1))){
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
