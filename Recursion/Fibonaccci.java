import java.util.*;

//Time Complexity= O(2^n) = by recursive tree method
//Space Complexity= O(n)

public class Fibonaccci {

    public static int fibbonacciNum(int n){
        int result;

        if(n<=1){
            result=n;
        }
        else{
            result= fibbonacciNum(n-1)+ fibbonacciNum(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        int value= fibbonacciNum(num);

        System.out.println("The value is "+value);

    }
}
