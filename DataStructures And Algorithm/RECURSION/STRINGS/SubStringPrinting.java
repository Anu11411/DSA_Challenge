package RECURSION.STRINGS;
import java.util.Scanner;
 // Given a string print all the substring 
public class SubStringPrinting
 {

    public static void findSubstring( String s)
    {
        for(int i = 0; i <s.length(); i++)
        {
            for(int j = i+1; j <= s.length(); j++)
            {
                System.out.print(s.substring(i, j)+ ",");
            }
        }
    }
     public static void main(String[] args) 
     {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the String : ");
         String str = input.nextLine();
        findSubstring(str);
     }
}
