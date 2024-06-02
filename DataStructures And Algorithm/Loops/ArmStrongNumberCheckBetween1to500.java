package Loops;
public class ArmStrongNumberCheckBetween1to500 
{
    public static void main(String[] args)
     {
          for(int i = 1 ; i <= 500 ; i++)
          {
            int number = i;
            int sum = 0;
            int temp = number ;

            while(temp != 0)
            {
                int digit = temp % 10;
                temp = temp / 10;
                 sum = sum + (digit*digit*digit);

            }
            if(sum == number){
                System.out.println(sum +"--->"+ number);
            }
          } 
    
    }

    }

