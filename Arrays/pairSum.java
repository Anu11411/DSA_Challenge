package Arrays;
import java.util.Scanner;
public class pairSum {
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the size of array :");  
     int size = input.nextInt(); 
     System.out.print("Enter the value of x");
     int x = input.nextInt();

      int arr[]= new int [size];

      for(int i=0; i < size; i++)
      {
        System.out.println("Enter the "+ i + " element :");
        arr[i] = input.nextInt();
      }
      int count = 0;
      for(int i = 0 ; i < size ; i++)
      {
        for(int j = i+1 ; j < size ; j++)
        {
            if(arr[i] + arr[j] == x)
             count = count +1;
        }
      }
     System.out.println(count);

    }

}
