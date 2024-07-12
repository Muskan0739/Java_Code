import java.util.*;

public class Assignment{

    public static int Sum(int n){
        int sum=0;

        //BASE CASE CONDITION
        if(n==0){
            return n;
        }
        //RECURSIVE METHOD CALL
        else{
            sum=n%10+ Sum(n/10);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n=sc.nextInt();
        
        int sum=Sum(n);

        System.out.println("Sum of the digits of the given number is : "+ sum);

    }
}