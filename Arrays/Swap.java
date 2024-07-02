package Arrays;

public class Swap {
    public static void fun(int arr[])
    {
       int temp = arr[0];
       arr[0]= arr[1];
       arr[1]= temp;
    }
    public static void main(String[] args) {
         int a[] ={12,34};
         System.out.println(a[0] +" "+ a[1]);
         fun(a);
         System.out.println(a[0]+ " "+a[1]);
    }
}
