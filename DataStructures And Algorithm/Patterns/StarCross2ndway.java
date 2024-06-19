import java.util.Scanner;
public class StarCross2ndway {
     public static void main(String[] args)
      {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = input.nextInt();
        for(int i = 1; i<=n ; i++)
        {
             for(int j = 1; j<= n ; j++)
             {
                if((i == j) || i+j== n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
             }
             System.out.println();
        }
     }
}
