package Arrays;
import java.util.Scanner;
public class BasicArray {
    public static void main(String[] args)
     {  
        Scanner input = new Scanner(System.in);
        
        int arr []= new int[4];
        for(int i = 0; i < arr.length ; i++)
        {
                System.out.print("Enter the element of array :");
            arr[i] = input.nextInt();
        }
        for(int  i = 0; i <arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
      
    }
}
