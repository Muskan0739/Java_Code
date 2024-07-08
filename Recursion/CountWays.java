
//PS: COUNT THE NUMBER OF WAYS YOU CAN CLIMB STAIRS

//Time Complexity= O(2^n)
//Space Complexity= O(n)


import java.util.*;

public class CountWays {

    //CODE OF FIBBONACCI SERIES
    public static int numOfWays(int n){
      int result;

      if(n<=1){
        return n;
      }
      else
      {
        result=numOfWays(n-1)+numOfWays(n-2);
      }
      return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stairs you want to climb");
        int n=sc.nextInt(); //n= number of stairs

        int count; //number of ways you can climb the given number of stairs

        //CALLING numOfWays METHOD 
        count=numOfWays(n+1);

        System.out.println("The number of ways you can climb the stairs is: " + count);

    }
}
