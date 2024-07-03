package Arrays;
import java.util.Scanner;
/*
 * Find the difference between the sum of elements at even indices
 * to the sum of elements at odd indices
 */
public class SumofEvenOddDifference {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = input.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the element :");
            arr[i]= input.nextInt();
        }
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 0 ; i < size; i++)
        {
            if(i % 2 == 0)
            {
                sumEven = sumEven + arr[i];
            }
            if(i % 2 !=0 )
            {
                sumOdd = sumOdd + arr[i];
            }
        }
        System.out.println("difference = "+ (sumEven -sumOdd));

    }
}
