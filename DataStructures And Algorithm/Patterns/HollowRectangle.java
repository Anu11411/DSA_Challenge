import java.util.Scanner;
public class HollowRectangle {
  public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the  number of rows :");
    int rows = input.nextInt();
    System.out.print("Enter number of columns :");
    int colm = input.nextInt();
    for(int i = 1 ; i<= rows ; i++)
    {
        for(int j = 1; j <=colm ; j++)
        {
            if(i == 1 || i == rows){
                System.out.print("*");
            }
            else{
                if(j == 1 || j== colm){
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
