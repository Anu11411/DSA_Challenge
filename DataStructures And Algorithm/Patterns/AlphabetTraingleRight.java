package Patterns;
import java.util.Scanner;
// Output 
// Enter the number of rows :5
//     A
//    BC
//   DEF
//  GHIJ
// KLMNO
public class AlphabetTraingleRight {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
          int row = input.nextInt();
          int a = 65;
          for(int i = 1 ; i <= row ; i++)
        {
            for(int j= 1; j <= row ; j++)
            {
                if((row-i) >= j )
                System.out.print(" ");

            else{
                   
                         System.out.print((char)a);
                         a++;
            }
           
        }
        System.out.println();
    }
}
}